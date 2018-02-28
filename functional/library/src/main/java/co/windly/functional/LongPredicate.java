package co.windly.functional;

/**
 * Represents a predicate (boolean-valued function) of one {@code long}-valued
 * argument. This is the {@code long}-consuming primitive type specialization of
 * {@link Predicate}.
 *
 * @see Predicate
 */
public interface LongPredicate {

  /**
   * Evaluates this predicate on the given argument.
   *
   * @param value the input argument
   * @return {@code true} if the input argument matches the predicate,
   * otherwise {@code false}
   */
  boolean test(long value);
}
