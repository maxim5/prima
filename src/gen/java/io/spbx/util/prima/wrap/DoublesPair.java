package io.spbx.util.prima.wrap;

import io.spbx.util.prima.func.BiDoubleConsumer;
import io.spbx.util.prima.func.BiDoubleFunction;
import io.spbx.util.prima.func.BiDoublePredicate;
import io.spbx.util.prima.func.DoubleBinaryOperator;
import io.spbx.util.prima.func.DoublePredicate;
import io.spbx.util.prima.func.DoubleUnaryOperator;
import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple immutable pair of two {@code double} values.
 */
@Generated(value = "$Type$sPair.java", date = "2024-09-20T09:36:23.137102476Z")
public record DoublesPair(double first, double second) {
    public static @NotNull DoublesPair of(double first, double second) {
        return new DoublesPair(first, second);
    }

    public static @NotNull DoublesPair of(double @NotNull[] array) {
        assert array.length == 2 : "Invalid array to create a pair from: length=%d".formatted(array.length);
        return new DoublesPair(array[0], array[1]);
    }

    public @NotNull DoublesPair withFirst(double first) {
        return DoublesPair.of(first, second);
    }

    public @NotNull DoublesPair withSecond(double second) {
        return DoublesPair.of(first, second);
    }

    public @NotNull DoublesPair swap() {
        return DoublesPair.of(second, first);
    }

    public @NotNull DoublesPair map(@NotNull DoubleUnaryOperator convertFirst, @NotNull DoubleUnaryOperator convertSecond) {
        return DoublesPair.of(convertFirst.applyToDouble(first), convertSecond.applyToDouble(second));
    }

    public @NotNull DoublesPair mapFirst(@NotNull DoubleUnaryOperator convert) {
        return this.map(convert, second -> second);
    }

    public @NotNull DoublesPair mapFirst(@NotNull DoubleBinaryOperator convert) {
        return DoublesPair.of(convert.applyToDouble(first, second), second);
    }

    public @NotNull DoublesPair mapSecond(@NotNull DoubleUnaryOperator convert) {
        return this.map(first -> first, convert);
    }

    public @NotNull DoublesPair mapSecond(@NotNull DoubleBinaryOperator convert) {
        return DoublesPair.of(first, convert.applyToDouble(first, second));
    }

    public <T> @NotNull T mapToObj(@NotNull BiDoubleFunction<T> convert) {
        return convert.apply(first, second);
    }

    public double mapToDouble(@NotNull DoubleBinaryOperator convert) {
        return convert.applyToDouble(first, second);
    }

    public boolean testFirst(@NotNull DoublePredicate predicate) {
        return predicate.test(first);
    }

    public boolean testSecond(@NotNull DoublePredicate predicate) {
        return predicate.test(second);
    }

    public boolean test(@NotNull BiDoublePredicate predicate) {
        return predicate.test(first, second);
    }

    public void apply(@NotNull BiDoubleConsumer action) {
        action.accept(first, second);
    }

    public @NotNull Stream<Double> stream() {
        return Stream.of(first, second);
    }

    public @NotNull List<Double> toList() {
        return Arrays.asList(first, second);
    }

    public double @NotNull[] toArray() {
        return new double[] { first, second };
    }

    public @NotNull Double @NotNull[] toDoubleArray() {
        return new Double[] { first, second };
    }

    @Override
    public String toString() {
        return "(%s, %s)".formatted(first, second);
    }
}
