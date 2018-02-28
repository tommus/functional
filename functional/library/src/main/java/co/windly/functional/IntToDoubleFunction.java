package co.windly.functional;

/**
 * Represents a function that accepts an int-valued argument and produces a
 * double-valued result.  This is the {@code int}-to-{@code double} primitive
 * specialization for {@link Function}.
 *
 * @see Function
 */
public interface IntToDoubleFunction {

  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  double applyAsDouble(int value);
}
