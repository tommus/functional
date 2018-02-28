package co.windly.functional;

/**
 * Represents a function that accepts a long-valued argument and produces a
 * result.  This is the {@code long}-consuming primitive specialization for
 * {@link Function}.
 *
 * @param <R> the type of the result of the function
 * @see Function
 */
public interface LongFunction<R> {

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  R apply(long value);
}
