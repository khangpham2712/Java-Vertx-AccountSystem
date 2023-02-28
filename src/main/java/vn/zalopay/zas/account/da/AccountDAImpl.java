package vn.zalopay.zas.account.da;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import vn.zalopay.zas.account.mapper.EntityMapper;
import vn.zalopay.zas.account.model.Account;
import vn.zalopay.zas.account.utils.AsyncHandler;

public class AccountDAImpl extends BaseTransactionDA implements AccountDA {
  private final String insertAccountQuery =
                  "INSERT INTO `accounts` (`name`, `password`, `dob`) VALUES (?, ?, ?)";
  private final String selectAccountQuery =
                  "SELECT `id`, `name`, `password`, `dob` FROM `accounts` WHERE id = ?";
  private final DataSource dataSource;
  private final AsyncHandler asyncHandler;

  public AccountDAImpl(DataSource dataSource, Vertx vertx) {
    this.dataSource = dataSource;
    this.asyncHandler = new AsyncHandler(vertx);
  }

  @Override
  public Executable<Account> insert(Account account) {
    return connection -> {
      Promise<Long> promise = Promise.promise();
      Object[] params = {account.getName(), account.getPassword(), account.getDob()};
      asyncHandler.run(() -> {
        try {
          executeInsertWithParams(
              promise, connection.unwrap(), insertAccountQuery, params, "insertAccount");
        } catch (SQLException e) {
          promise.fail(e);
        }
      });
      Promise<Account> res = Promise.promise();
      promise.future().andThen(rs -> {
        if (rs.succeeded()) {
          account.setId(rs.result());
          res.complete(account);
        } else {
          res.fail(rs.cause());
        }
      });
      return res.future();
    };
  }

  @Override
  public Executable<Account> update(
      Account account,
      ArrayList<String> fields,
      ArrayList<String> values) {
    return connection -> {
      if (fields.size() == 0) {
        return Future.failedFuture("missing all fields");
      }
      Promise<Void> promise = Promise.promise();
      Object[] params = values.toArray();
      asyncHandler.run(() -> {
        try {
          executeWithParams(
              promise,
              connection.unwrap(),
              buildUpdateAccountQuery(fields),
              params,
              "updateAccount");
        } catch (SQLException e) {
          promise.fail(e);
        }
      });
      Promise<Account> res = Promise.promise();
      promise.future().andThen(rs -> {
        if (rs.succeeded()) {
          res.complete(account);
        } else {
          res.fail(rs.cause());
        }
      });
      return res.future();
    };
  }

  @Override
  public Future<Account> selectById(long id) {
    Promise<Account> promise = Promise.promise();
    Object[] params = {id};
    asyncHandler.run(() ->
        queryEntity(
          "queryAccount",
          promise,
          selectAccountQuery,
          params,
          this::mapRs2EntityAccount,
          dataSource::getConnection,
          false)
    );
    return promise.future();
  }

  private Account mapRs2EntityAccount(ResultSet resultSet) throws Exception {
    Account account = null;
    while (resultSet.next()) {
      account = new Account();
      EntityMapper.getInstance().loadResultSetIntoObject(resultSet, account);
    }
    return account;
  }

  private String buildUpdateAccountQuery(ArrayList<String> fields) {
    int len = fields.size();
    StringBuilder query = new StringBuilder("UPDATE `accounts` SET ");
    query.append(fields.get(0)).append(" = ?");
    if (len > 1) {
      for (int i = 1; i < len; i++) {
        query.append(", ").append(fields.get(i)).append(" = ?");
      }
    }
    query.append(" WHERE id = ?");
    return query.toString();
  }
}
