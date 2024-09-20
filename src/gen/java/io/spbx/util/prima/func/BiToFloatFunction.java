package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a binary function that produces a primitive {@code float}-valued result.
 */
@FunctionalInterface
@Generated(value = "BiTo$Type$Function.java", date = "2024-09-20T09:36:23.508389507Z")
public interface BiToFloatFunction<T, U> extends BiFunction<T, U, Float> {
    /**
     * Applies this function to the given arguments.
     */
    float applyToFloat(T left, U right);

    @Override
    default Float apply(T left, U right) {
        return applyToFloat(left, right);
    }
}
