package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * A simple predicate for the primitive <code>char</code> values.
 */
@FunctionalInterface
@Generated(value = "$Type$Predicate.java", date = "2024-09-04T12:43:13.856443Z")
public interface CharPredicate extends
        Predicate<Character>,
        Function<Character, Boolean> {
    /**
     * Evaluates this predicate on the given argument.
     */
    boolean test(char value);

    @Override
    default boolean test(Character value) {
        return this.test((char) value);
    }

    @Override
    default Boolean apply(Character value) {
        return this.test((char) value);
    }
}
