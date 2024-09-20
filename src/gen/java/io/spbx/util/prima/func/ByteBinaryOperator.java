package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BinaryOperator;

/**
 * Represents an operation upon two {@code byte}-valued operands and producing a
 * {@code byte}-valued result. This is the primitive type specialization of
 * {@link BinaryOperator} for {@code byte}.
 */
@FunctionalInterface
@Generated(value = "$Type$BinaryOperator.java", date = "2024-09-20T09:36:23.439922515Z")
public interface ByteBinaryOperator extends
        BinaryOperator<Byte>,
        ObjByteFunction<Byte, Byte> {
    /**
     * Applies this operator to the given operands.
     */
    byte applyToByte(byte left, byte right);

    @Override
    default Byte apply(Byte left, Byte right) {
        return applyToByte(left, right);
    }

    @Override
    default Byte apply(Byte left, byte right) {
        return this.applyToByte(left, right);
    }
}
