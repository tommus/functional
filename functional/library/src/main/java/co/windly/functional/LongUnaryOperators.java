package co.windly.functional;

public final class LongUnaryOperators {

  /**
   * Returns a unary operator that always returns its input argument.
   *
   * @return a unary operator that always returns its input argument
   */
  public static LongUnaryOperator identity() {
    return new LongUnaryOperator() {
      @Override public long applyAsLong(long t) {
        return t;
      }
    };
  }

  private LongUnaryOperators() {
    /* No-op. */
  }
}
