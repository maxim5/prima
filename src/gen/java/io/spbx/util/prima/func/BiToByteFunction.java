package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a binary function that produces a primitive <code>byte</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "BiTo$Type$Function.java", date = "2024-09-02T09:14:55.666336600Z")
public interface BiToByteFunction<T, U> extends BiFunction<T, U, Byte> {
    /**
     * Applies this function to the given arguments.
     */
    byte applyToByte(T left, U right);

    @Override
    default Byte apply(T left, U right) {
        return applyToByte(left, right);
    }
}
