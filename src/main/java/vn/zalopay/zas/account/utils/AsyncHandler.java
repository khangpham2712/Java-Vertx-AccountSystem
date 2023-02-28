package vn.zalopay.zas.account.utils;

import io.vertx.core.Vertx;
import lombok.Builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Builder
public class AsyncHandler {
  private static final Logger log = LoggerFactory.getLogger(AsyncHandler.class);
  private final Vertx vertx;

  public AsyncHandler(Vertx vertx) {
    this.vertx = vertx;
  }

  public void run(Runnable runnable) {
    if (vertx != null) {
      vertx.executeBlocking(
          future -> {
            try {
              runnable.run();
              future.complete();
            } catch (Exception e) {
              future.fail(e);
            }
          },
          false,
          res -> {
            if (res.failed()) {
              log.error("Failed executeBlocking cause={}", ExceptionUtil.getDetail(res.cause()));
            }
          });
    }
  }
}
