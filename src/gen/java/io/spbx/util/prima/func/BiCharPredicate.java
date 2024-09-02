package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiPredicate;

/**
 * Represents a predicate (boolean-valued function) of two <code>char</code>-valued.
 * This is the two-arity specialization of {@link Predicate}.
 * This is the primitive type specialization of {@link BiPredicate} for <code>char</code>.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Predicate.java", date = "2024-09-02T09:14:55.662336900Z")
public interface BiCharPredicate extends BiPredicate<Character, Character>, ObjCharFunction<Character, Boolean>, BiCharFunction<Boolean> {
    /**
     * Evaluates this predicate on the {@code char} arguments.
     */
    boolean test(char left, char right);

    @Override
    default boolean test(Character left, Character right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Character left, char right) {
        return test((char) left, right);
    }

    @Override
    default Boolean apply(char left, char right) {
        return test(left, right);
    }

    @Override
    default Boolean apply(Character left, Character right) {
        return test((char) left, (char) right);
    }
}
