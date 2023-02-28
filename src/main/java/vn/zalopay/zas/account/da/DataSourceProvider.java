package vn.zalopay.zas.account.da;

import io.vertx.ext.jdbc.JDBCClient;
import javax.sql.DataSource;
import vn.zalopay.zas.account.config.MysqlConfig;

public interface DataSourceProvider {
  JDBCClient getVertxDataSource(MysqlConfig config, DataSource dataSource);

  DataSource getDataSource(MysqlConfig config, String dbName);
}
