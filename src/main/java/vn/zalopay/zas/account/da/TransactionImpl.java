package vn.zalopay.zas.account.da;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.ext.sql.SQLClient;
import io.vertx.ext.sql.SQLConnection;
import java.sql.Connection;
import java.sql.SQLException;

//
// TransactionImpl interface help you controllable what's function belong to transaction
//

public class TransactionImpl implements Transaction {
  // For blocking operation
  private final SQLClient dataSource;
  private SQLConnection connection;

  public TransactionImpl(SQLClient sqlClient) {
    this.dataSource = sqlClient;
  }

  public Future<Void> begin() {
    Promise<Void> promise = Promise.promise();
    //    Tracker.TrackerBuilder tracker = getTracker();
    dataSource.getConnection(rs -> {
      if (rs.failed()) {
        //            tracker.step("begin-fail").build().record();
        promise.fail(rs.cause());
      } else {
        //            tracker.step("begin-ok").build().record();
        connection = rs.result();
        setAutoCommitFalse(promise);
      }
    });
    return promise.future();
  }

  private void setAutoCommitFalse(Promise<Void> promise) {
    Connection unwrapConn = connection.unwrap();
    try {
      if (unwrapConn.getAutoCommit()) {
        connection.setAutoCommit(false, promise);
      }
    } catch (SQLException e) {
      promise.fail(e);
    }
  }

  public Future<Void> commit() {
    if (connection == null) {
      return Future.failedFuture(new SQLException("Transaction NOT start yet"));
    }

    //    Tracker.TrackerBuilder tracker = getTracker();
    Promise<Void> promise = Promise.promise();
    connection.commit(res -> tracking(res, promise, "commit"));

    return promise.future();
  }

  public Future<Void> rollback() {
    if (connection == null) {
      return Future.succeededFuture();
    }

    //    Tracker.TrackerBuilder tracker = getTracker();
    Promise<Void> promise = Promise.promise();
    connection.rollback(res -> tracking(res, promise, "rollback"));

    return promise.future();
  }

  @Override
  public Future<Void> close() {
    if (connection == null) {
      return Future.succeededFuture();
    }

    //    Tracker.TrackerBuilder tracker = getTracker();
    Promise<Void> promise = Promise.promise();
    connection.close(res -> tracking(res, promise, "close"));
    return promise.future();
  }

  //  private Tracker.TrackerBuilder getTracker() {
  //    return Tracker.builder().metricName(SYSTEM_METRIC_NAME);
  //  }

  @Override
  public <R> Future<R> execute(Executable<R> executable) {
    return executable.execute(connection);
  }

  private void tracking(
      AsyncResult<Void> res,
      Promise<Void> promise,
      String methodName
  //      Tracker.TrackerBuilder tracker
  ) {
    if (res.succeeded()) {
      //      tracker.step(methodName + "-ok").build().record();
      promise.complete(res.result());
    } else {
      //      tracker.step(methodName + "-fail").build().record();
      promise.fail(res.cause());
    }
  }


}
