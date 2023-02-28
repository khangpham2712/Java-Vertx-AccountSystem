package vn.zalopay.zas.account.da;

import io.vertx.core.Future;
import java.util.ArrayList;
import vn.zalopay.zas.account.model.Account;

public interface AccountDA {
  Executable<Account> insert(Account account);

  Executable<Account> update(
      Account account,
      ArrayList<String> fields,
      ArrayList<String> values);

  Future<Account> selectById(long id);
}
