package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.UnaryOperator;

/**
 * Represents an operation on a single {@code int}-valued operand that produces
 * an {@code int}-valued result.
 */
@FunctionalInterface
@Generated(value = "$Type$UnaryOperator.java", date = "2024-09-20T09:36:23.480207044Z")
public interface IntUnaryOperator extends
        java.util.function.IntUnaryOperator,
        UnaryOperator<Integer>, IntFunction<Integer>, ToIntFunction<Integer> {
    /**
     * Applies this operator to the given operands.
     */
    int applyToInt(int operand);

    @Override
    default Integer apply(int value) {
        return this.applyToInt(value);
    }

    @Override
    default Integer apply(Integer value) {
        return this.applyToInt(value);
    }

    @Override
    default int applyToInt(Integer value) {
        return this.applyToInt((int) value);
    }

    @Override
    default int applyAsInt(int operand) {
        return this.applyToInt(operand);
    }
}
