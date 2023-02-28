package vn.zalopay.zas.account.da;

/** Created by thinhda. Date: 2019-11-08 */
@FunctionalInterface
public interface FunctionEx<T, R> {
  R apply(T t) throws Exception;
}
