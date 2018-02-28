package co.windly.functional;

/**
 * Represents a supplier of results.
 *
 * <p>There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * @param <T> the type of results supplied by this supplier
 */
public interface Supplier<T> {

  /**
   * Gets a result.
   *
   * @return a result
   */
  T get();
}
