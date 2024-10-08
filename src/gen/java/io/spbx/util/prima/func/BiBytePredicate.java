package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiPredicate;

/**
 * Represents a predicate (boolean-valued function) of two {@code byte}-valued.
 * This is the two-arity specialization of {@link Predicate}.
 * This is the primitive type specialization of {@link BiPredicate} for {@code byte}.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Predicate.java", date = "2024-09-20T09:36:23.503308643Z")
public interface BiBytePredicate extends BiPredicate<Byte, Byte>, ObjByteFunction<Byte, Boolean>, BiByteFunction<Boolean> {
    /**
     * Evaluates this predicate on the {@code byte} arguments.
     */
    boolean test(byte left, byte right);

    @Override
    default boolean test(Byte left, Byte right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Byte left, byte right) {
        return test((byte) left, right);
    }

    @Override
    default Boolean apply(byte left, byte right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Byte left, Byte right) {
        return test((byte) left, (byte) right);
    }
}
