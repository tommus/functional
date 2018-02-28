package co.windly.functional;

/**
 * Represents a function that accepts a double-valued argument and produces a
 * result.  This is the {@code double}-consuming primitive specialization for
 * {@link Function}.
 *
 * @param <R> the type of the result of the function
 * @see Function
 */
public interface DoubleFunction<R> {

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  R apply(double value);
}
