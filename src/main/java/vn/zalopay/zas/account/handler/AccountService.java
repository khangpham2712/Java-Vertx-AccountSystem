package vn.zalopay.zas.account.handler;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;

import java.util.ArrayList;
import javax.sql.DataSource;

import vn.zalopay.zas.account.bcrypt.BCryptHashing;
import vn.zalopay.zas.account.config.ServiceConfig;
import vn.zalopay.zas.account.da.AccountDA;
import vn.zalopay.zas.account.da.AccountDAImpl;
import vn.zalopay.zas.account.da.DataSourceProviderImpl;
import vn.zalopay.zas.account.da.Transaction;
import vn.zalopay.zas.account.da.TransactionProvider;
import vn.zalopay.zas.account.da.TransactionProviderImpl;
import vn.zalopay.zas.account.protobuf.Account;
import vn.zalopay.zas.account.protobuf.AccountCreateRequest;
import vn.zalopay.zas.account.protobuf.AccountCreateResponse;
import vn.zalopay.zas.account.protobuf.AccountQueryRequest;
import vn.zalopay.zas.account.protobuf.AccountQueryResponse;
import vn.zalopay.zas.account.protobuf.AccountUpdateRequest;
import vn.zalopay.zas.account.protobuf.AccountUpdateResponse;
import vn.zalopay.zas.account.protobuf.VertxAccountServiceGrpc;

public class AccountService extends VertxAccountServiceGrpc.AccountServiceVertxImplBase {
  private final AccountDA accountDA;
  private final Vertx vertx;
  private final ServiceConfig config;
  private final DataSource dataSource;
  private final TransactionProvider transactionProvider;

  public AccountService(Vertx vertx, ServiceConfig config) {
    this.vertx = vertx;
    this.config = config;
    this.dataSource =
      new DataSourceProviderImpl(this.vertx)
        .getDataSource(this.config.getMysqlConfig(), "account");
    this.transactionProvider =
      new TransactionProviderImpl(new DataSourceProviderImpl(vertx)
        .getVertxDataSource(this.config.getMysqlConfig(), this.dataSource));
    this.accountDA = new AccountDAImpl(this.dataSource, this.vertx);
  }

  @Override
  public Future<AccountCreateResponse> accountCreate(AccountCreateRequest request) {
    vn.zalopay.zas.account.model.Account account =
      new vn.zalopay.zas.account.model.Account(
        request.getName(),
        BCryptHashing.hash(request.getPassword()),
        request.getDob());

    Promise<vn.zalopay.zas.account.model.Account> promise = Promise.promise();
    Promise<AccountCreateResponse> response = Promise.promise();

    Transaction transaction = transactionProvider.newTransaction();
    transaction
      .begin()
      .compose(next -> transaction.execute(accountDA.insert(account)))
      .andThen(rs -> {
        if (rs.succeeded()) {
          transaction.commit();
          promise.complete(rs.result());
        } else {
          transaction.rollback();
          promise.fail(rs.cause());
        }
        transaction.close();
      });

    promise.future().andThen(req -> {
      AccountCreateResponse accountCreateResponse;
      if (req.succeeded()) {
        accountCreateResponse = AccountCreateResponse.newBuilder()
          .setErrorCode(0)
          .setMsg("successful")
          .setAccount(this.accountMapping(req.result()))
          .build();
      } else {
        accountCreateResponse = AccountCreateResponse.newBuilder()
          .setErrorCode(1)
          .setMsg(req.cause().getMessage())
          .build();
      }
      response.complete(accountCreateResponse);
    });

    return response.future();
  }

  @Override
  public Future<AccountUpdateResponse> accountUpdate(AccountUpdateRequest request) {
    vn.zalopay.zas.account.model.Account account =
      new vn.zalopay.zas.account.model.Account(
        request.getId(),
        request.getName(),
        request.getPassword(),
        request.getDob()
      );

    Promise<vn.zalopay.zas.account.model.Account> promise = Promise.promise();
    Promise<AccountUpdateResponse> response = Promise.promise();
    ArrayList<ArrayList<String>> lst = getFields(request);

    Transaction transaction = transactionProvider.newTransaction();
    transaction
      .begin()
      .compose(next -> transaction.execute(accountDA.update(account, lst.get(0), lst.get(1))))
      .andThen(rs -> {
        if (rs.succeeded()) {
          transaction.commit();
          promise.complete(rs.result());
        } else {
          transaction.rollback();
          promise.fail(rs.cause());
        }
        transaction.close();
      });

    promise.future().andThen(req -> {
      AccountUpdateResponse accountUpdateResponse;
      if (req.succeeded()) {
        accountUpdateResponse = AccountUpdateResponse.newBuilder()
          .setErrorCode(0)
          .setMsg("successful")
          .setAccount(this.accountMapping(req.result()))
          .build();
      } else {
        accountUpdateResponse = AccountUpdateResponse.newBuilder()
          .setErrorCode(1)
          .setMsg(req.cause().getMessage())
          .build();
      }
      response.complete(accountUpdateResponse);
    });

    return response.future();
  }

  @Override
  public Future<AccountQueryResponse> accountQuery(AccountQueryRequest request) {
    Promise<vn.zalopay.zas.account.model.Account> promise = Promise.promise();
    Promise<AccountQueryResponse> response = Promise.promise();

    accountDA.selectById(request.getId())
      .onSuccess(account -> promise.complete(account))
      .onFailure(error -> promise.fail(error.getMessage()));

    promise.future().andThen(req -> {
      AccountQueryResponse accountQueryResponse;
      if (req.succeeded()) {
        accountQueryResponse = AccountQueryResponse.newBuilder()
          .setErrorCode(0)
          .setMsg("found account " + request.getId())
          .setAccount(this.accountMapping(req.result()))
          .build();
      } else {
        accountQueryResponse = AccountQueryResponse.newBuilder()
          .setErrorCode(1)
          .setMsg(req.cause().getMessage())
          .build();
      }
      response.complete(accountQueryResponse);
    });

    return response.future();
  }

  private Account accountMapping(vn.zalopay.zas.account.model.Account account) {
    return Account.newBuilder()
      .setId(account.getId())
      .setName(account.getName())
      .setPassword(account.getPassword())
      .setDob(account.getDob())
      .build();
  }

  private <T> ArrayList<ArrayList<String>> getFields(T data) {
    ArrayList<ArrayList<String>> lst = new ArrayList<>();
    if (data.getClass() == AccountUpdateRequest.class) {
      lst.add(new ArrayList<>());
      lst.add(new ArrayList<>());
      var request = (AccountUpdateRequest)data;
      if (!request.getName().equals("")) {
        lst.get(0).add("name");
        lst.get(1).add(request.getName());
      }
      if (!request.getPassword().equals("")) {
        String password = BCryptHashing.hash(request.getPassword());
        lst.get(0).add("password");
        lst.get(1).add(password);
      }
      if (!request.getDob().equals("")) {
        lst.get(0).add("dob");
        lst.get(1).add(request.getDob());
      }
      lst.get(1).add(Long.toString(request.getId()));
    }
    return lst;
  }
}
