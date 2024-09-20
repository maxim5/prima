package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive {@code float}-valued result.
 */
@FunctionalInterface
@Generated(value = "To$Type$Function.java", date = "2024-09-20T09:36:23.527244381Z")
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
