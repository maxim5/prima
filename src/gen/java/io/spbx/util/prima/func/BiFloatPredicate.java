package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiPredicate;

/**
 * Represents a predicate (boolean-valued function) of two {@code float}-valued.
 * This is the two-arity specialization of {@link Predicate}.
 * This is the primitive type specialization of {@link BiPredicate} for {@code float}.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Predicate.java", date = "2024-09-20T09:36:23.503308643Z")
public interface BiFloatPredicate extends BiPredicate<Float, Float>, ObjFloatFunction<Float, Boolean>, BiFloatFunction<Boolean> {
    /**
     * Evaluates this predicate on the {@code float} arguments.
     */
    boolean test(float left, float right);

    @Override
    default boolean test(Float left, Float right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Float left, float right) {
        return test((float) left, right);
    }

    @Override
    default Boolean apply(float left, float right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Float left, Float right) {
        return test((float) left, (float) right);
    }
}
