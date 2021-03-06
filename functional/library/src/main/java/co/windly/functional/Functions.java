package co.windly.functional;

public final class Functions {

  /**
   * Returns a function that always returns its input argument.
   *
   * @param <T> the type of the input and output objects to the function
   * @return a function that always returns its input argument
   */
  public static <T> Function<T, T> identity() {
    return new Function<T, T>() {
      @Override public T apply(T t) {
        return t;
      }
    };
  }

  private Functions() {
    /* No-op. */
  }
}
