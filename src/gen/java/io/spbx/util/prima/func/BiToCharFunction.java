package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a binary function that produces a primitive <code>char</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "BiTo$Type$Function.java", date = "2024-09-02T09:14:55.666336600Z")
public interface BiToCharFunction<T, U> extends BiFunction<T, U, Character> {
    /**
     * Applies this function to the given arguments.
     */
    char applyToChar(T left, U right);

    @Override
    default Character apply(T left, U right) {
        return applyToChar(left, right);
    }
}
