package vn.zalopay.zas.account.config;

import lombok.Data;

@Data
public class MysqlConfig {
  private String host;
  private String username;
  private String password;
  private int port;
  private int poolSize;
  private String driver;
  private int maxLifetimeMillis = 600000;
  private boolean cachePrepStmts = true;
  private boolean useServerPrepStmts = true;
  private int prepStmtCacheSize = 250;
  private int prepStmtCacheSqlLimit = 2048;
  private boolean autoCommit = true;
}
