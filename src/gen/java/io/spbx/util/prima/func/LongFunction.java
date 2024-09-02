package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that accepts a primitive <code>long</code>-valued argument
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "$Type$Function.java", date = "2024-09-02T09:14:55.636331100Z")
public interface LongFunction<R> extends Function<Long, R> {
    /**
     * Applies this function to the given argument.
     */
    R apply(long value);

    @Override
    default R apply(Long value) {
        return this.apply((long) value);
    }
}
