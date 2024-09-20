package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.UnaryOperator;

/**
 * Represents an operation on a single {@code float}-valued operand that produces
 * an {@code float}-valued result.
 */
@FunctionalInterface
@Generated(value = "$Type$UnaryOperator.java", date = "2024-09-20T09:36:23.480207044Z")
public interface FloatUnaryOperator extends
        UnaryOperator<Float>, FloatFunction<Float>, ToFloatFunction<Float> {
    /**
     * Applies this operator to the given operands.
     */
    float applyToFloat(float operand);

    @Override
    default Float apply(float value) {
        return this.applyToFloat(value);
    }

    @Override
    default Float apply(Float value) {
        return this.applyToFloat(value);
    }

    @Override
    default float applyToFloat(Float value) {
        return this.applyToFloat((float) value);
    }
}
