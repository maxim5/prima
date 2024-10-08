package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a binary function that produces a primitive {@code int}-valued result.
 */
@FunctionalInterface
@Generated(value = "BiTo$Type$Function.java", date = "2024-09-20T09:36:23.508389507Z")
public interface BiToIntFunction<T, U> extends BiFunction<T, U, Integer> {
    /**
     * Applies this function to the given arguments.
     */
    int applyToInt(T left, U right);

    @Override
    default Integer apply(T left, U right) {
        return applyToInt(left, right);
    }
}
