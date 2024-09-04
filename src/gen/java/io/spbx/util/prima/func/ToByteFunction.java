package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive <code>byte</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "To$Type$Function.java", date = "2024-09-04T12:43:13.902453700Z")
public interface ToByteFunction<T> extends Function<T, Byte> {
    /**
     * Applies this function to the given argument.
     */
    byte applyToByte(T value);

    @Override
    default Byte apply(T value) {
        return applyToByte(value);
    }
}
