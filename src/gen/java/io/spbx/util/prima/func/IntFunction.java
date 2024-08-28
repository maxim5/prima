package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that accepts a primitive <code>int</code>-valued argument
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "$Type$Function.java", date = "2024-08-25T16:01:41.957037Z")
public interface IntFunction<R> extends Function<Integer, R> {
    /**
     * Applies this function to the given argument.
     */
    R apply(int value);

    @Override
    default R apply(Integer value) {
        return this.apply((int) value);
    }
}
