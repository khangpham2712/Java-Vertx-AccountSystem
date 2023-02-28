package vn.zalopay.zas.account.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.zalopay.zas.account.mapper.DBTable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
  @DBTable(columnName = "id")
  private long id;
  @DBTable(columnName = "name")
  private String name;
  @DBTable(columnName = "password")
  private String password;
  @DBTable(columnName = "dob")
  private String dob;

  public Account(String name, String password, String dob) {
    this.name = name;
    this.password = password;
    this.dob = dob;
  }
}
