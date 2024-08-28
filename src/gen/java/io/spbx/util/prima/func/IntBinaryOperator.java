package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BinaryOperator;

/**
 * Represents an operation upon two <code>int</code>-valued operands and producing a
 * <code>int</code>-valued result.   This is the primitive type specialization of
 * {@link BinaryOperator} for <code>int</code>.
 */
@FunctionalInterface
@Generated(value = "$Type$BinaryOperator.java", date = "2024-08-25T16:01:41.941033800Z")
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
