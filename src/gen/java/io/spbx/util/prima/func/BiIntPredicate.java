package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiPredicate;

/**
 * Represents a predicate (boolean-valued function) of two {@code int}-valued.
 * This is the two-arity specialization of {@link Predicate}.
 * This is the primitive type specialization of {@link BiPredicate} for {@code int}.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Predicate.java", date = "2024-09-20T09:36:23.503308643Z")
public interface BiIntPredicate extends BiPredicate<Integer, Integer>, ObjIntFunction<Integer, Boolean>, BiIntFunction<Boolean> {
    /**
     * Evaluates this predicate on the {@code int} arguments.
     */
    boolean test(int left, int right);

    @Override
    default boolean test(Integer left, Integer right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Integer left, int right) {
        return test((int) left, right);
    }

    @Override
    default Boolean apply(int left, int right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Integer left, Integer right) {
        return test((int) left, (int) right);
    }
}
