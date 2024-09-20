package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive {@code int}-valued result.
 */
@FunctionalInterface
@Generated(value = "To$Type$Function.java", date = "2024-09-20T09:36:23.527244381Z")
public interface ToIntFunction<T> extends Function<T, Integer> {
    /**
     * Applies this function to the given argument.
     */
    int applyToInt(T value);

    @Override
    default Integer apply(T value) {
        return applyToInt(value);
    }
}
