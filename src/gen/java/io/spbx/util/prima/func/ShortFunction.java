package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that accepts a primitive <code>short</code>-valued argument
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "$Type$Function.java", date = "2024-09-04T12:43:13.850441800Z")
public interface ShortFunction<R> extends Function<Short, R> {
    /**
     * Applies this function to the given argument.
     */
    R apply(short value);

    @Override
    default R apply(Short value) {
        return this.apply((short) value);
    }
}
