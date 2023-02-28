package vn.zalopay.zas.account.bcrypt;

public class BCryptHashing {
  public static String hash(String rawPassword) {
    return BCrypt.hashpw(rawPassword, BCrypt.gensalt(12));
  }

  public static boolean verify(String rawPassword, String hashedPassword) {
    return BCrypt.checkpw(rawPassword, hashedPassword);
  }
}
