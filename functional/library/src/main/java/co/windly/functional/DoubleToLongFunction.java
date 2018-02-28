package co.windly.functional;

/**
 * Represents a function that accepts a double-valued argument and produces a
 * long-valued result.  This is the {@code double}-to-{@code long} primitive
 * specialization for {@link Function}.
 *
 * @see Function
 */
public interface DoubleToLongFunction {

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  long applyAsLong(double value);
}
