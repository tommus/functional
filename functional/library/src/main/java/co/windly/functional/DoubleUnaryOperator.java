package co.windly.functional;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * a {@code double}-valued result.  This is the primitive type specialization of
 * {@link UnaryOperator} for {@code double}.
 *
 * @see UnaryOperator
 */
public interface DoubleUnaryOperator {

  /**
   * Applies this operator to the given operand.
   *
   * @param operand the operand
   * @return the operator result
   */
  double applyAsDouble(double operand);
}
