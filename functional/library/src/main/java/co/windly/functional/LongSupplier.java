package co.windly.functional;

/**
 * Represents a supplier of {@code long}-valued results.  This is the
 * {@code long}-producing primitive specialization of {@link Supplier}.
 *
 * <p>There is no requirement that a distinct result be returned each
 * time the supplier is invoked.
 *
 * @see Supplier
 */
public interface LongSupplier {

  /**
   * Gets a result.
   *
   * @return a result
   */
  long getAsLong();
}
