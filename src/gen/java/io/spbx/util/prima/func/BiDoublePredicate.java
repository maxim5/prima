package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiPredicate;

/**
 * Represents a predicate (boolean-valued function) of two {@code double}-valued.
 * This is the two-arity specialization of {@link Predicate}.
 * This is the primitive type specialization of {@link BiPredicate} for {@code double}.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Predicate.java", date = "2024-09-20T09:36:23.503308643Z")
public interface BiDoublePredicate extends BiPredicate<Double, Double>, ObjDoubleFunction<Double, Boolean>, BiDoubleFunction<Boolean> {
    /**
     * Evaluates this predicate on the {@code double} arguments.
     */
    boolean test(double left, double right);

    @Override
    default boolean test(Double left, Double right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Double left, double right) {
        return test((double) left, right);
    }

    @Override
    default Boolean apply(double left, double right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Double left, Double right) {
        return test((double) left, (double) right);
    }
}
