package co.windly.functional;

/**
 * Represents an operation on a single {@code long}-valued operand that produces
 * a {@code long}-valued result.  This is the primitive type specialization of
 * {@link UnaryOperator} for {@code long}.
 *
 * @see UnaryOperator
 */
public interface LongUnaryOperator {

  /**
   * Applies this operator to the given operand.
   *
   * @param operand the operand
   * @return the operator result
   */
  long applyAsLong(long operand);
}
