package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive <code>long</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "To$Type$Function.java", date = "2024-09-02T09:14:55.678340600Z")
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
