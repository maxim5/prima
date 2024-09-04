package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two primitive <code>float</code>-valued arguments
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Function.java", date = "2024-09-04T12:43:13.880448900Z")
public interface BiFloatFunction<R> extends BiFunction<Float, Float, R> {
    /**
     * Applies this function to the given arguments.
     */
    R apply(float left, float right);

    @Override
    default R apply(Float left, Float right) {
        return this.apply((float) left, (float) right);
    }
}
