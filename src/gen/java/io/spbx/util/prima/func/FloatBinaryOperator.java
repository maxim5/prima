package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BinaryOperator;

/**
 * Represents an operation upon two {@code float}-valued operands and producing a
 * {@code float}-valued result. This is the primitive type specialization of
 * {@link BinaryOperator} for {@code float}.
 */
@FunctionalInterface
@Generated(value = "$Type$BinaryOperator.java", date = "2024-09-20T09:36:23.439922515Z")
public interface FloatBinaryOperator extends
        BinaryOperator<Float>,
        ObjFloatFunction<Float, Float> {
    /**
     * Applies this operator to the given operands.
     */
    float applyToFloat(float left, float right);

    @Override
    default Float apply(Float left, Float right) {
        return applyToFloat(left, right);
    }

    @Override
    default Float apply(Float left, float right) {
        return this.applyToFloat(left, right);
    }
}
