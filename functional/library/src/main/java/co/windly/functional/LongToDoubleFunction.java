package co.windly.functional;

/**
 * Represents a function that accepts a long-valued argument and produces a
 * double-valued result.  This is the {@code long}-to-{@code double} primitive
 * specialization for {@link Function}.
 *
 * @see Function
 */
public interface LongToDoubleFunction {

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  double applyAsDouble(long value);
}
