package co.windly.functional;

/**
 * Represents a function that accepts a long-valued argument and produces an
 * int-valued result.  This is the {@code long}-to-{@code int} primitive
 * specialization for {@link Function}.
 *
 * @see Function
 */
public interface LongToIntFunction {

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  int applyAsInt(long value);
}
