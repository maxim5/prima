package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiPredicate;

/**
 * Represents a predicate (boolean-valued function) of two {@code long}-valued.
 * This is the two-arity specialization of {@link Predicate}.
 * This is the primitive type specialization of {@link BiPredicate} for {@code long}.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Predicate.java", date = "2024-09-20T09:36:23.503308643Z")
public interface BiLongPredicate extends BiPredicate<Long, Long>, ObjLongFunction<Long, Boolean>, BiLongFunction<Boolean> {
    /**
     * Evaluates this predicate on the {@code long} arguments.
     */
    boolean test(long left, long right);

    @Override
    default boolean test(Long left, Long right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Long left, long right) {
        return test((long) left, right);
    }

    @Override
    default Boolean apply(long left, long right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Long left, Long right) {
        return test((long) left, (long) right);
    }
}
