package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a binary function that produces a primitive <code>long</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "BiTo$Type$Function.java", date = "2024-09-04T12:43:13.889450300Z")
public interface BiToLongFunction<T, U> extends BiFunction<T, U, Long> {
    /**
     * Applies this function to the given arguments.
     */
    long applyToLong(T left, U right);

    @Override
    default Long apply(T left, U right) {
        return applyToLong(left, right);
    }
}
