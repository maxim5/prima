package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive <code>char</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "To$Type$Function.java", date = "2024-09-02T09:14:55.678340600Z")
public interface ToCharFunction<T> extends Function<T, Character> {
    /**
     * Applies this function to the given argument.
     */
    char applyToChar(T value);

    @Override
    default Character apply(T value) {
        return applyToChar(value);
    }
}
