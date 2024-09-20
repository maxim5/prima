package io.spbx.util.prima.wrap;

import io.spbx.util.prima.func.BiShortConsumer;
import io.spbx.util.prima.func.BiShortFunction;
import io.spbx.util.prima.func.BiShortPredicate;
import io.spbx.util.prima.func.ShortBinaryOperator;
import io.spbx.util.prima.func.ShortPredicate;
import io.spbx.util.prima.func.ShortUnaryOperator;
import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple immutable pair of two {@code short} values.
 */
@Generated(value = "$Type$sPair.java", date = "2024-09-20T09:36:23.137102476Z")
public record ShortsPair(short first, short second) {
    public static @NotNull ShortsPair of(short first, short second) {
        return new ShortsPair(first, second);
    }

    public static @NotNull ShortsPair of(short @NotNull[] array) {
        assert array.length == 2 : "Invalid array to create a pair from: length=%d".formatted(array.length);
        return new ShortsPair(array[0], array[1]);
    }

    public @NotNull ShortsPair withFirst(short first) {
        return ShortsPair.of(first, second);
    }

    public @NotNull ShortsPair withSecond(short second) {
        return ShortsPair.of(first, second);
    }

    public @NotNull ShortsPair swap() {
        return ShortsPair.of(second, first);
    }

    public @NotNull ShortsPair map(@NotNull ShortUnaryOperator convertFirst, @NotNull ShortUnaryOperator convertSecond) {
        return ShortsPair.of(convertFirst.applyToShort(first), convertSecond.applyToShort(second));
    }

    public @NotNull ShortsPair mapFirst(@NotNull ShortUnaryOperator convert) {
        return this.map(convert, second -> second);
    }

    public @NotNull ShortsPair mapFirst(@NotNull ShortBinaryOperator convert) {
        return ShortsPair.of(convert.applyToShort(first, second), second);
    }

    public @NotNull ShortsPair mapSecond(@NotNull ShortUnaryOperator convert) {
        return this.map(first -> first, convert);
    }

    public @NotNull ShortsPair mapSecond(@NotNull ShortBinaryOperator convert) {
        return ShortsPair.of(first, convert.applyToShort(first, second));
    }

    public <T> @NotNull T mapToObj(@NotNull BiShortFunction<T> convert) {
        return convert.apply(first, second);
    }

    public short mapToShort(@NotNull ShortBinaryOperator convert) {
        return convert.applyToShort(first, second);
    }

    public boolean testFirst(@NotNull ShortPredicate predicate) {
        return predicate.test(first);
    }

    public boolean testSecond(@NotNull ShortPredicate predicate) {
        return predicate.test(second);
    }

    public boolean test(@NotNull BiShortPredicate predicate) {
        return predicate.test(first, second);
    }

    public void apply(@NotNull BiShortConsumer action) {
        action.accept(first, second);
    }

    public @NotNull Stream<Short> stream() {
        return Stream.of(first, second);
    }

    public @NotNull List<Short> toList() {
        return Arrays.asList(first, second);
    }

    public short @NotNull[] toArray() {
        return new short[] { first, second };
    }

    public @NotNull Short @NotNull[] toShortArray() {
        return new Short[] { first, second };
    }

    @Override
    public String toString() {
        return "(%s, %s)".formatted(first, second);
    }
}
