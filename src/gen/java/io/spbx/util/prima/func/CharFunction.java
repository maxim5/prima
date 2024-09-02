package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that accepts a primitive <code>char</code>-valued argument
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "$Type$Function.java", date = "2024-09-02T09:14:55.636331100Z")
public interface CharFunction<R> extends Function<Character, R> {
    /**
     * Applies this function to the given argument.
     */
    R apply(char value);

    @Override
    default R apply(Character value) {
        return this.apply((char) value);
    }
}
