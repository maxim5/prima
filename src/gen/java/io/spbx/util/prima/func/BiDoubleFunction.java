package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two primitive <code>double</code>-valued arguments
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Function.java", date = "2024-09-02T09:14:55.658334600Z")
public interface BiDoubleFunction<R> extends BiFunction<Double, Double, R> {
    /**
     * Applies this function to the given arguments.
     */
    R apply(double left, double right);

    @Override
    default R apply(Double left, Double right) {
        return this.apply((double) left, (double) right);
    }
}
