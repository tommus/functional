package co.windly.functional;

/**
 * Represents an operation upon two {@code int}-valued operands and producing an
 * {@code int}-valued result.   This is the primitive type specialization of
 * {@link BinaryOperator} for {@code int}.
 *
 * @see BinaryOperator
 * @see IntUnaryOperator
 */
public interface IntBinaryOperator {

  /**
   * Applies this operator to the given operands.
   *
   * @param left the first operand
   * @param right the second operand
   * @return the operator result
   */
  int applyAsInt(int left, int right);
}
