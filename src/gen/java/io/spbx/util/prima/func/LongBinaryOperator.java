package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BinaryOperator;

/**
 * Represents an operation upon two {@code long}-valued operands and producing a
 * {@code long}-valued result. This is the primitive type specialization of
 * {@link BinaryOperator} for {@code long}.
 */
@FunctionalInterface
@Generated(value = "$Type$BinaryOperator.java", date = "2024-09-20T09:36:23.439922515Z")
public interface LongBinaryOperator extends
        java.util.function.LongBinaryOperator,
        BinaryOperator<Long>,
        ObjLongFunction<Long, Long> {
    /**
     * Applies this operator to the given operands.
     */
    long applyToLong(long left, long right);

    @Override
    default Long apply(Long left, Long right) {
        return applyToLong(left, right);
    }

    @Override
    default Long apply(Long left, long right) {
        return this.applyToLong(left, right);
    }

    @Override
    default long applyAsLong(long left, long right) {
        return this.applyToLong(left, right);
    }
}
