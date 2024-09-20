package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two primitive {@code byte}-valued arguments
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Function.java", date = "2024-09-20T09:36:23.497470407Z")
public interface BiByteFunction<R> extends BiFunction<Byte, Byte, R> {
    /**
     * Applies this function to the given arguments.
     */
    R apply(byte left, byte right);

    @Override
    default R apply(Byte left, Byte right) {
        return this.apply((byte) left, (byte) right);
    }
}
