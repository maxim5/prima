package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive <code>short</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "To$Type$Function.java", date = "2024-09-02T09:14:55.678340600Z")
public interface ToShortFunction<T> extends Function<T, Short> {
    /**
     * Applies this function to the given argument.
     */
    short applyToShort(T value);

    @Override
    default Short apply(T value) {
        return applyToShort(value);
    }
}
