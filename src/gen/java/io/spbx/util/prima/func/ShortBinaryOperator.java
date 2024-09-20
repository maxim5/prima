package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BinaryOperator;

/**
 * Represents an operation upon two {@code short}-valued operands and producing a
 * {@code short}-valued result. This is the primitive type specialization of
 * {@link BinaryOperator} for {@code short}.
 */
@FunctionalInterface
@Generated(value = "$Type$BinaryOperator.java", date = "2024-09-20T09:36:23.439922515Z")
public interface ShortBinaryOperator extends
        BinaryOperator<Short>,
        ObjShortFunction<Short, Short> {
    /**
     * Applies this operator to the given operands.
     */
    short applyToShort(short left, short right);

    @Override
    default Short apply(Short left, Short right) {
        return applyToShort(left, right);
    }

    @Override
    default Short apply(Short left, short right) {
        return this.applyToShort(left, right);
    }
}
