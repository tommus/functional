package co.windly.functional;

/**
 * Represents a supplier of {@code double}-valued results.  This is the
 * {@code double}-producing primitive specialization of {@link Supplier}.
 *
 * <p>There is no requirement that a distinct result be returned each
 * time the supplier is invoked.
 *
 * @see Supplier
 */
public interface DoubleSupplier {

  /**
   * Gets a result.
   *
   * @return a result
   */
  double getAsDouble();
}
