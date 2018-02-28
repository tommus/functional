package co.windly.functional;

/**
 * Represents a function that accepts two arguments and produces a double-valued
 * result.  This is the {@code double}-producing primitive specialization for
 * {@link BiFunction}.
 *
 * @param <T> the type of the first argument to the function
 * @param <U> the type of the second argument to the function
 * @see BiFunction
 */
public interface ToDoubleBiFunction<T, U> {

  /**
   * Applies this function to the given arguments.
   *
   * @param t the first function argument
   * @param u the second function argument
   * @return the function result
   */
  double applyAsDouble(T t, U u);
}
