package co.windly.functional;

/**
 * Represents an operation on a single {@code int}-valued operand that produces
 * an {@code int}-valued result.  This is the primitive type specialization of
 * {@link UnaryOperator} for {@code int}.
 *
 * @see UnaryOperator
 */
public interface IntUnaryOperator {

  /**
   * Applies this operator to the given operand.
   *
   * @param operand the operand
   * @return the operator result
   */
  int applyAsInt(int operand);
}
