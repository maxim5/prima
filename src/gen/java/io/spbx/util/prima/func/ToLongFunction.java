package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive <code>long</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "To$Type$Function.java", date = "2024-08-25T16:01:41.990044200Z")
public interface ToLongFunction<T> extends Function<T, Long> {
    /**
     * Applies this function to the given argument.
     */
    long applyToLong(T value);

    @Override
    default Long apply(T value) {
        return applyToLong(value);
    }
}
