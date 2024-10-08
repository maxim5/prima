package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * A simple predicate for the primitive {@code short} values.
 */
@FunctionalInterface
@Generated(value = "$Type$Predicate.java", date = "2024-09-20T09:36:23.468034345Z")
public interface ShortPredicate extends
        Predicate<Short>,
        Function<Short, Boolean> {
    /**
     * Evaluates this predicate on the given argument.
     */
    boolean test(short value);

    @Override
    default boolean test(Short value) {
        return this.test((short) value);
    }

    @Override
    default Boolean apply(Short value) {
        return this.test((short) value);
    }
}
