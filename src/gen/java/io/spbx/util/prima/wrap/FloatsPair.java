package io.spbx.util.prima.wrap;

import io.spbx.util.prima.func.BiFloatConsumer;
import io.spbx.util.prima.func.BiFloatFunction;
import io.spbx.util.prima.func.BiFloatPredicate;
import io.spbx.util.prima.func.FloatBinaryOperator;
import io.spbx.util.prima.func.FloatPredicate;
import io.spbx.util.prima.func.FloatUnaryOperator;
import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple immutable pair of two <code>float</code> values.
 */
@Generated(value = "$Type$sPair.java", date = "2024-09-04T12:43:13.923459200Z")
public record FloatsPair(float first, float second) {
    public static @NotNull FloatsPair of(float first, float second) {
        return new FloatsPair(first, second);
    }

    public static @NotNull FloatsPair of(float @NotNull[] array) {
        assert array.length == 2 : "Invalid array to create a pair from: length=%d".formatted(array.length);
        return new FloatsPair(array[0], array[1]);
    }

    public @NotNull FloatsPair withFirst(float first) {
        return FloatsPair.of(first, second);
    }

    public @NotNull FloatsPair withSecond(float second) {
        return FloatsPair.of(first, second);
    }

    public @NotNull FloatsPair swap() {
        return FloatsPair.of(second, first);
    }

    public @NotNull FloatsPair map(@NotNull FloatUnaryOperator convertFirst, @NotNull FloatUnaryOperator convertSecond) {
        return FloatsPair.of(convertFirst.applyToFloat(first), convertSecond.applyToFloat(second));
    }

    public @NotNull FloatsPair mapFirst(@NotNull FloatUnaryOperator convert) {
        return this.map(convert, second -> second);
    }

    public @NotNull FloatsPair mapFirst(@NotNull FloatBinaryOperator convert) {
        return FloatsPair.of(convert.applyToFloat(first, second), second);
    }

    public @NotNull FloatsPair mapSecond(@NotNull FloatUnaryOperator convert) {
        return this.map(first -> first, convert);
    }

    public @NotNull FloatsPair mapSecond(@NotNull FloatBinaryOperator convert) {
        return FloatsPair.of(first, convert.applyToFloat(first, second));
    }

    public <T> @NotNull T mapToObj(@NotNull BiFloatFunction<T> convert) {
        return convert.apply(first, second);
    }

    public float mapToFloat(@NotNull FloatBinaryOperator convert) {
        return convert.applyToFloat(first, second);
    }

    public boolean testFirst(@NotNull FloatPredicate predicate) {
        return predicate.test(first);
    }

    public boolean testSecond(@NotNull FloatPredicate predicate) {
        return predicate.test(second);
    }

    public boolean test(@NotNull BiFloatPredicate predicate) {
        return predicate.test(first, second);
    }

    public void apply(@NotNull BiFloatConsumer action) {
        action.accept(first, second);
    }

    public @NotNull Stream<Float> stream() {
        return Stream.of(first, second);
    }

    public @NotNull List<Float> toList() {
        return Arrays.asList(first, second);
    }

    public float @NotNull[] toArray() {
        return new float[] { first, second };
    }

    public @NotNull Float @NotNull[] toFloatArray() {
        return new Float[] { first, second };
    }

    @Override
    public String toString() {
        return "(%s, %s)".formatted(first, second);
    }
}
