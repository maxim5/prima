package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive <code>double</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "To$Type$Function.java", date = "2024-08-25T16:01:41.990044200Z")
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
