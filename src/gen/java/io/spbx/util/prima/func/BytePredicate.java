package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * A simple predicate for the primitive <code>byte</code> values.
 */
@FunctionalInterface
@Generated(value = "$Type$Predicate.java", date = "2024-08-25T16:01:41.963038800Z")
public interface BytePredicate extends
        Predicate<Byte>,
        Function<Byte, Boolean> {
    /**
     * Evaluates this predicate on the given argument.
     */
    boolean test(byte value);

    @Override
    default boolean test(Byte value) {
        return this.test((byte) value);
    }

    @Override
    default Boolean apply(Byte value) {
        return this.test((byte) value);
    }
}
