package co.windly.functional;

/**
 * Represents a predicate (boolean-valued function) of one {@code double}-valued
 * argument. This is the {@code double}-consuming primitive type specialization
 * of {@link Predicate}.
 *
 * @see Predicate
 */
public interface DoublePredicate {

  /**
   * Evaluates this predicate on the given argument.
   *
   * @param value the input argument
   * @return {@code true} if the input argument matches the predicate,
   * otherwise {@code false}
   */
  boolean test(double value);
}
