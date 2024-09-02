package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two primitive <code>byte</code>-valued arguments
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Function.java", date = "2024-09-02T09:14:55.658334600Z")
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
