package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiPredicate;

/**
 * Represents a predicate (boolean-valued function) of two <code>short</code>-valued.
 * This is the two-arity specialization of {@link Predicate}.
 * This is the primitive type specialization of {@link BiPredicate} for <code>short</code>.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Predicate.java", date = "2024-09-02T09:14:55.662336900Z")
public interface BiShortPredicate extends BiPredicate<Short, Short>, ObjShortFunction<Short, Boolean>, BiShortFunction<Boolean> {
    /**
     * Evaluates this predicate on the {@code short} arguments.
     */
    boolean test(short left, short right);

    @Override
    default boolean test(Short left, Short right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Short left, short right) {
        return test((short) left, right);
    }

    @Override
    default Boolean apply(short left, short right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Short left, Short right) {
        return test((short) left, (short) right);
    }
}
