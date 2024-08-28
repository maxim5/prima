package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that accepts a primitive <code>double</code>-valued argument
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "$Type$Function.java", date = "2024-08-25T16:01:41.957037Z")
public interface DoubleFunction<R> extends Function<Double, R> {
    /**
     * Applies this function to the given argument.
     */
    R apply(double value);

    @Override
    default R apply(Double value) {
        return this.apply((double) value);
    }
}
