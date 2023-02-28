package vn.zalopay.zas.account.server;

import io.vertx.core.Vertx;
import io.vertx.grpc.VertxServer;
import io.vertx.grpc.VertxServerBuilder;
import java.io.IOException;
import vn.zalopay.zas.account.config.ServiceConfig;
import vn.zalopay.zas.account.handler.AccountService;

public class GrpcServer implements Server {
  private final ServiceConfig config;
  private final Vertx vertx;
  private VertxServer rpcServer;

  public GrpcServer(Vertx vertx, ServiceConfig config) {
    this.vertx = vertx;
    this.config = config;
  }

  public void start() {
    AccountService service = new AccountService(vertx, config);

    rpcServer = VertxServerBuilder
      .forAddress(vertx, config.getVertxConfig().getHost(), config.getVertxConfig().getPort())
      .addService(service)
      .build();

    try {
      rpcServer.start();
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  public void stop() {
    if (rpcServer != null) {
      rpcServer.shutdown();
    }
  }
}
