package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive <code>float</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "To$Type$Function.java", date = "2024-09-04T12:43:13.902453700Z")
public interface ToFloatFunction<T> extends Function<T, Float> {
    /**
     * Applies this function to the given argument.
     */
    float applyToFloat(T value);

    @Override
    default Float apply(T value) {
        return applyToFloat(value);
    }
}
