package co.windly.functional;

/**
 * Represents an operation upon two {@code long}-valued operands and producing a
 * {@code long}-valued result.   This is the primitive type specialization of
 * {@link BinaryOperator} for {@code long}.
 *
 * @see BinaryOperator
 * @see LongUnaryOperator
 */
public interface LongBinaryOperator {

  /**
   * Applies this operator to the given operands.
   *
   * @param left the first operand
   * @param right the second operand
   * @return the operator result
   */
  long applyAsLong(long left, long right);
}
