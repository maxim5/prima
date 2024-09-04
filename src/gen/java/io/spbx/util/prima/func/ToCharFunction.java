package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive <code>char</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "To$Type$Function.java", date = "2024-09-04T12:43:13.902453700Z")
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
