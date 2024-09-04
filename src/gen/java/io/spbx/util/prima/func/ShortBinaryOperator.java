package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BinaryOperator;

/**
 * Represents an operation upon two <code>short</code>-valued operands and producing a
 * <code>short</code>-valued result.   This is the primitive type specialization of
 * {@link BinaryOperator} for <code>short</code>.
 */
@FunctionalInterface
@Generated(value = "$Type$BinaryOperator.java", date = "2024-09-04T12:43:13.838438900Z")
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
