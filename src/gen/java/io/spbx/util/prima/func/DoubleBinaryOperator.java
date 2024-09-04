package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BinaryOperator;

/**
 * Represents an operation upon two <code>double</code>-valued operands and producing a
 * <code>double</code>-valued result.   This is the primitive type specialization of
 * {@link BinaryOperator} for <code>double</code>.
 */
@FunctionalInterface
@Generated(value = "$Type$BinaryOperator.java", date = "2024-09-04T12:43:13.838438900Z")
public interface DoubleBinaryOperator extends
        java.util.function.DoubleBinaryOperator,
        BinaryOperator<Double>,
        ObjDoubleFunction<Double, Double> {
    /**
     * Applies this operator to the given operands.
     */
    double applyToDouble(double left, double right);

    @Override
    default Double apply(Double left, Double right) {
        return applyToDouble(left, right);
    }

    @Override
    default Double apply(Double left, double right) {
        return this.applyToDouble(left, right);
    }

    @Override
    default double applyAsDouble(double left, double right) {
        return this.applyToDouble(left, right);
    }
}
