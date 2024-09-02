package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive <code>double</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "To$Type$Function.java", date = "2024-09-02T09:14:55.678340600Z")
public interface ToDoubleFunction<T> extends Function<T, Double> {
    /**
     * Applies this function to the given argument.
     */
    double applyToDouble(T value);

    @Override
    default Double apply(T value) {
        return applyToDouble(value);
    }
}
