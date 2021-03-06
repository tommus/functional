package co.windly.functional;

/**
 * Represents a function that accepts an int-valued argument and produces a
 * long-valued result.  This is the {@code int}-to-{@code long} primitive
 * specialization for {@link Function}.
 *
 * @see Function
 */
public interface IntToLongFunction {

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  long applyAsLong(int value);
}
