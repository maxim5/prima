package io.spbx.util.prima.func;

import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * A simple predicate for the primitive <code>double</code> values.
 */
@FunctionalInterface
@Generated(value = "$Type$Predicate.java", date = "2024-09-02T09:14:55.640331900Z")
public interface DoublePredicate extends
        java.util.function.DoublePredicate,
        Predicate<Double>,
        Function<Double, Boolean> {
    /**
     * Evaluates this predicate on the given argument.
     */
    boolean test(double value);

    @Override
    default boolean test(Double value) {
        return this.test((double) value);
    }

    @Override
    default Boolean apply(Double value) {
        return this.test((double) value);
    }

    @Override
    default @NotNull DoublePredicate negate() {
        return value -> !test(value);
    }

    @Override
    default @NotNull DoublePredicate and(@NotNull java.util.function.DoublePredicate that) {
        return value -> this.test(value) && that.test(value);
    }

    @Override
    default @NotNull DoublePredicate and(@NotNull Predicate<? super Double> that) {
        return value -> this.test(value) && that.test(value);
    }

    @Override
    default @NotNull DoublePredicate or(@NotNull java.util.function.DoublePredicate that) {
        return value -> this.test(value) || that.test(value);
    }

    @Override
    default @NotNull DoublePredicate or(@NotNull Predicate<? super Double> that) {
        return value -> this.test(value) || that.test(value);
    }
}
