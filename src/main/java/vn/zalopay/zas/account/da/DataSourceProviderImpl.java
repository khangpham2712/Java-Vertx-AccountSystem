package vn.zalopay.zas.account.da;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.vertx.core.Vertx;
import io.vertx.ext.jdbc.JDBCClient;
import javax.sql.DataSource;
import vn.zalopay.zas.account.config.MysqlConfig;

public class DataSourceProviderImpl implements DataSourceProvider {
  private final Vertx vertx;

  public DataSourceProviderImpl(Vertx vertx) {
    this.vertx = vertx;
  }

  @Override
  public JDBCClient getVertxDataSource(MysqlConfig config, DataSource dataSource) {

    return JDBCClient.create(vertx, dataSource);
  }

  @Override
  public DataSource getDataSource(MysqlConfig config, String dbName) {
    String url =
        "jdbc:mysql://127.0.0.1:"
          + config.getPort()
          + "/"
          + dbName
          + "?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    HikariConfig hikariConfig = new HikariConfig();
    hikariConfig.setDriverClassName(config.getDriver());
    hikariConfig.setJdbcUrl(url);
    hikariConfig.setUsername(config.getUsername());
    hikariConfig.setPassword(config.getPassword());
    hikariConfig.setMaximumPoolSize(config.getPoolSize());
    hikariConfig.setAutoCommit(config.isAutoCommit());
    hikariConfig.addDataSourceProperty("useServerPrepStmts", "" + config.isUseServerPrepStmts());
    hikariConfig.addDataSourceProperty("cachePrepStmts", "" + config.isCachePrepStmts());
    hikariConfig.addDataSourceProperty("prepStmtCacheSize", "" + config.getPrepStmtCacheSize());
    hikariConfig.addDataSourceProperty(
        "prepStmtCacheSqlLimit", "" + config.getPrepStmtCacheSqlLimit());
    hikariConfig.addDataSourceProperty("maxLifetime", "" + config.getMaxLifetimeMillis());
    //    hikariConfig.setMetricRegistry(Tracker.getMeterRegistry());
    return new HikariDataSource(hikariConfig);
  }
}
