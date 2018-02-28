package co.windly.functional;

/**
 * Represents a predicate (boolean-valued function) of one {@code int}-valued
 * argument. This is the {@code int}-consuming primitive type specialization of
 * {@link Predicate}.
 *
 * @see Predicate
 */
public interface IntPredicate {

  /**
   * Evaluates this predicate on the given argument.
   *
   * @param value the input argument
   * @return {@code true} if the input argument matches the predicate,
   * otherwise {@code false}
   */
  boolean test(int value);
}
