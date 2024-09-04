package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two primitive <code>short</code>-valued arguments
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Function.java", date = "2024-09-04T12:43:13.880448900Z")
public interface BiShortFunction<R> extends BiFunction<Short, Short, R> {
    /**
     * Applies this function to the given arguments.
     */
    R apply(short left, short right);

    @Override
    default R apply(Short left, Short right) {
        return this.apply((short) left, (short) right);
    }
}
