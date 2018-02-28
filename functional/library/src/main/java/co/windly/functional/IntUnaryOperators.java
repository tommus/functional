package co.windly.functional;

public final class IntUnaryOperators {

  /**
   * Returns a unary operator that always returns its input argument.
   *
   * @return a unary operator that always returns its input argument
   */
  public static IntUnaryOperator identity() {
    return new IntUnaryOperator() {
      @Override public int applyAsInt(int t) {
        return t;
      }
    };
  }

  private IntUnaryOperators() {
    /* No-op. */
  }
}
