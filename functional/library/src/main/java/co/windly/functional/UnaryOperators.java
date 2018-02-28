package co.windly.functional;

public final class UnaryOperators {

  /**
   * Returns a unary operator that always returns its input argument.
   *
   * @param <T> the type of the input and output of the operator
   * @return a unary operator that always returns its input argument
   */
  public static <T> UnaryOperator<T> identity() {
    return new UnaryOperator<T>() {
      @Override public T apply(T t) {
        return t;
      }
    };
  }

  private UnaryOperators() {
    /* No-op. */
  }
}
