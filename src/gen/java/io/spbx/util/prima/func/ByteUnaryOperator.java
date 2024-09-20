package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.UnaryOperator;

/**
 * Represents an operation on a single {@code byte}-valued operand that produces
 * an {@code byte}-valued result.
 */
@FunctionalInterface
@Generated(value = "$Type$UnaryOperator.java", date = "2024-09-20T09:36:23.480207044Z")
public interface ByteUnaryOperator extends
        UnaryOperator<Byte>, ByteFunction<Byte>, ToByteFunction<Byte> {
    /**
     * Applies this operator to the given operands.
     */
    byte applyToByte(byte operand);

    @Override
    default Byte apply(byte value) {
        return this.applyToByte(value);
    }

    @Override
    default Byte apply(Byte value) {
        return this.applyToByte(value);
    }

    @Override
    default byte applyToByte(Byte value) {
        return this.applyToByte((byte) value);
    }
}
