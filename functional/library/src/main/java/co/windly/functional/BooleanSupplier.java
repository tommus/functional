package co.windly.functional;

/**
 * Represents a supplier of {@code boolean}-valued results.  This is the
 * {@code boolean}-producing primitive specialization of {@link Supplier}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #getAsBoolean()}.
 *
 * @see Supplier
 */
public interface BooleanSupplier {

  /**
   * Gets a result.
   *
   * @return a result
   */
  boolean getAsBoolean();
}
