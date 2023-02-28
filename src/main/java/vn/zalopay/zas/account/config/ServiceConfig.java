package vn.zalopay.zas.account.config;

import lombok.Data;

@Data
public class ServiceConfig {
  private VertxConfig vertxConfig;
  private MysqlConfig mysqlConfig;
}
