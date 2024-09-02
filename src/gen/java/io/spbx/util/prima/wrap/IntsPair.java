package io.spbx.util.prima.wrap;

import io.spbx.util.prima.func.BiIntConsumer;
import io.spbx.util.prima.func.BiIntFunction;
import io.spbx.util.prima.func.BiIntPredicate;
import io.spbx.util.prima.func.IntBinaryOperator;
import io.spbx.util.prima.func.IntPredicate;
import io.spbx.util.prima.func.IntUnaryOperator;
import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple immutable pair of two <code>int</code> values.
 */
@Generated(value = "$Type$sPair.java", date = "2024-09-02T09:14:55.693343900Z")
public record IntsPair(int first, int second) {
    public static @NotNull IntsPair of(int first, int second) {
        return new IntsPair(first, second);
    }

    public static @NotNull IntsPair of(int @NotNull[] array) {
        assert array.length == 2 : "Invalid array to create a pair from: length=%d".formatted(array.length);
        return new IntsPair(array[0], array[1]);
    }

    public @NotNull IntsPair withFirst(int first) {
        return IntsPair.of(first, second);
    }

    public @NotNull IntsPair withSecond(int second) {
        return IntsPair.of(first, second);
    }

    public @NotNull IntsPair swap() {
        return IntsPair.of(second, first);
    }

    public @NotNull IntsPair map(@NotNull IntUnaryOperator convertFirst, @NotNull IntUnaryOperator convertSecond) {
        return IntsPair.of(convertFirst.applyToInt(first), convertSecond.applyToInt(second));
    }

    public @NotNull IntsPair mapFirst(@NotNull IntUnaryOperator convert) {
        return this.map(convert, second -> second);
    }

    public @NotNull IntsPair mapFirst(@NotNull IntBinaryOperator convert) {
        return IntsPair.of(convert.applyToInt(first, second), second);
    }

    public @NotNull IntsPair mapSecond(@NotNull IntUnaryOperator convert) {
        return this.map(first -> first, convert);
    }

    public @NotNull IntsPair mapSecond(@NotNull IntBinaryOperator convert) {
        return IntsPair.of(first, convert.applyToInt(first, second));
    }

    public <T> @NotNull T mapToObj(@NotNull BiIntFunction<T> convert) {
        return convert.apply(first, second);
    }

    public int mapToInt(@NotNull IntBinaryOperator convert) {
        return convert.applyToInt(first, second);
    }

    public boolean testFirst(@NotNull IntPredicate predicate) {
        return predicate.test(first);
    }

    public boolean testSecond(@NotNull IntPredicate predicate) {
        return predicate.test(second);
    }

    public boolean test(@NotNull BiIntPredicate predicate) {
        return predicate.test(first, second);
    }

    public void apply(@NotNull BiIntConsumer action) {
        action.accept(first, second);
    }

    public @NotNull Stream<Integer> stream() {
        return Stream.of(first, second);
    }

    public @NotNull List<Integer> toList() {
        return Arrays.asList(first, second);
    }

    public int @NotNull[] toArray() {
        return new int[] { first, second };
    }

    public @NotNull Integer @NotNull[] toIntegerArray() {
        return new Integer[] { first, second };
    }

    @Override
    public String toString() {
        return "(%s, %s)".formatted(first, second);
    }
}
