package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.UnaryOperator;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * an {@code double}-valued result.
 */
@FunctionalInterface
@Generated(value = "$Type$UnaryOperator.java", date = "2024-09-20T09:36:23.480207044Z")
public interface DoubleUnaryOperator extends
        java.util.function.DoubleUnaryOperator,
        UnaryOperator<Double>, DoubleFunction<Double>, ToDoubleFunction<Double> {
    /**
     * Applies this operator to the given operands.
     */
    double applyToDouble(double operand);

    @Override
    default Double apply(double value) {
        return this.applyToDouble(value);
    }

    @Override
    default Double apply(Double value) {
        return this.applyToDouble(value);
    }

    @Override
    default double applyToDouble(Double value) {
        return this.applyToDouble((double) value);
    }

    @Override
    default double applyAsDouble(double operand) {
        return this.applyToDouble(operand);
    }
}
