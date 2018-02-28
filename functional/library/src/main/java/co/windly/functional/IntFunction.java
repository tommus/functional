package co.windly.functional;

/**
 * Represents a function that accepts an int-valued argument and produces a
 * result.  This is the {@code int}-consuming primitive specialization for
 * {@link Function}.
 *
 * @param <R> the type of the result of the function
 * @see Function
 */
public interface IntFunction<R> {

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  R apply(int value);
}
