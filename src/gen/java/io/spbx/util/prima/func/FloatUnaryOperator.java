package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.UnaryOperator;

/**
 * Represents an operation on a single <code>float</code>-valued operand that produces
 * an <code>float</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "$Type$UnaryOperator.java", date = "2024-09-02T09:14:55.650333600Z")
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
