package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that accepts a primitive {@code byte}-valued argument
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "$Type$Function.java", date = "2024-09-20T09:36:23.461362672Z")
public interface ByteFunction<R> extends Function<Byte, R> {
    /**
     * Applies this function to the given argument.
     */
    R apply(byte value);

    @Override
    default R apply(Byte value) {
        return this.apply((byte) value);
    }
}
