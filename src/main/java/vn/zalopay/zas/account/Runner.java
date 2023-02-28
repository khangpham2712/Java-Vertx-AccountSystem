package vn.zalopay.zas.account;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import vn.zalopay.zas.account.config.FileConfigLoader;
import vn.zalopay.zas.account.config.ServiceConfig;
import vn.zalopay.zas.account.server.GrpcServer;
import vn.zalopay.zas.account.server.Server;

public class Runner {
  public static void main(String[] args) {
    try {
      ServiceConfig config = FileConfigLoader.loadFromEnv("./conf/development.yaml");
      VertxOptions vertxOptions = new VertxOptions();
      int eventLoopPoolSize = vertxOptions.getEventLoopPoolSize();
      Vertx vertx = Vertx.vertx();
      Server grpcServer = new GrpcServer(vertx, config);

      vertx
          .deployVerticle(
            () ->
              new AbstractVerticle() {
                @Override
                public void start() {
                  grpcServer.start();
                }

                @Override
                public void stop() {
                  grpcServer.stop();
                }
              },
            new DeploymentOptions().setInstances(eventLoopPoolSize));
    } catch (Exception e) {
      System.exit(1);
    }
  }
}
