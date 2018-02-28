package co.windly.functional;

/**
 * Represents an operation that accepts a single {@code long}-valued argument and
 * returns no result.  This is the primitive type specialization of
 * {@link Consumer} for {@code long}.  Unlike most other functional interfaces,
 * {@code LongConsumer} is expected to operate via side-effects.
 *
 * @see Consumer
 */
public interface LongConsumer {

  /**
   * Performs this operation on the given argument.
   *
   * @param value the input argument
   */
  void accept(long value);
}
