package co.windly.functional;

/**
 * Represents an operation that accepts an object-valued and a
 * {@code double}-valued argument, and returns no result.  This is the
 * {@code (reference, double)} specialization of {@link BiConsumer}.
 * Unlike most other functional interfaces, {@code ObjDoubleConsumer} is
 * expected to operate via side-effects.
 *
 * @param <T> the type of the object argument to the operation
 * @see BiConsumer
 */
public interface ObjDoubleConsumer<T> {

  /**
   * Performs this operation on the given arguments.
   *
   * @param t the first input argument
   * @param value the second input argument
   */
  void accept(T t, double value);
}
