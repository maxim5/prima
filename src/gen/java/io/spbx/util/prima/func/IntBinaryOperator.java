package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BinaryOperator;

/**
 * Represents an operation upon two {@code int}-valued operands and producing a
 * {@code int}-valued result. This is the primitive type specialization of
 * {@link BinaryOperator} for {@code int}.
 */
@FunctionalInterface
@Generated(value = "$Type$BinaryOperator.java", date = "2024-09-20T09:36:23.439922515Z")
public interface IntBinaryOperator extends
        java.util.function.IntBinaryOperator,
        BinaryOperator<Integer>,
        ObjIntFunction<Integer, Integer> {
    /**
     * Applies this operator to the given operands.
     */
    int applyToInt(int left, int right);

    @Override
    default Integer apply(Integer left, Integer right) {
        return applyToInt(left, right);
    }

    @Override
    default Integer apply(Integer left, int right) {
        return this.applyToInt(left, right);
    }

    @Override
    default int applyAsInt(int left, int right) {
        return this.applyToInt(left, right);
    }
}
