package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a binary function that produces a primitive <code>double</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "BiTo$Type$Function.java", date = "2024-09-04T12:43:13.889450300Z")
public interface BiToDoubleFunction<T, U> extends BiFunction<T, U, Double> {
    /**
     * Applies this function to the given arguments.
     */
    double applyToDouble(T left, U right);

    @Override
    default Double apply(T left, U right) {
        return applyToDouble(left, right);
    }
}
