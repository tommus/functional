package co.windly.functional;

/**
 * Represents an operation that accepts a single {@code int}-valued argument and
 * returns no result.  This is the primitive type specialization of
 * {@link Consumer} for {@code int}.  Unlike most other functional interfaces,
 * {@code IntConsumer} is expected to operate via side-effects.
 *
 * @see Consumer
 */
public interface IntConsumer {

  /**
   * Performs this operation on the given argument.
   *
   * @param value the input argument
   */
  void accept(int value);
}
