package co.windly.functional;

/**
 * Represents a predicate (boolean-valued function) of two arguments.  This is
 * the two-arity specialization of {@link Predicate}.
 *
 * @param <T> the type of the first argument to the predicate
 * @param <U> the type of the second argument the predicate
 * @see Predicate
 */
public interface BiPredicate<T, U> {

  /**
   * Evaluates this predicate on the given arguments.
   *
   * @param t the first input argument
   * @param u the second input argument
   * @return {@code true} if the input arguments match the predicate,
   * otherwise {@code false}
   */
  boolean test(T t, U u);
}
