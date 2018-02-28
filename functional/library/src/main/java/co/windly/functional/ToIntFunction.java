package co.windly.functional;

/**
 * Represents a function that produces an int-valued result.  This is the
 * {@code int}-producing primitive specialization for {@link Function}.
 *
 * @param <T> the type of the input to the function
 * @see Function
 */
public interface ToIntFunction<T> {

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  int applyAsInt(T value);
}
