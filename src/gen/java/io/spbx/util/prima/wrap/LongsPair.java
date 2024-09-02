package io.spbx.util.prima.wrap;

import io.spbx.util.prima.func.BiLongConsumer;
import io.spbx.util.prima.func.BiLongFunction;
import io.spbx.util.prima.func.BiLongPredicate;
import io.spbx.util.prima.func.LongBinaryOperator;
import io.spbx.util.prima.func.LongPredicate;
import io.spbx.util.prima.func.LongUnaryOperator;
import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple immutable pair of two <code>long</code> values.
 */
@Generated(value = "$Type$sPair.java", date = "2024-09-02T09:14:55.693343900Z")
public record LongsPair(long first, long second) {
    public static @NotNull LongsPair of(long first, long second) {
        return new LongsPair(first, second);
    }

    public static @NotNull LongsPair of(long @NotNull[] array) {
        assert array.length == 2 : "Invalid array to create a pair from: length=%d".formatted(array.length);
        return new LongsPair(array[0], array[1]);
    }

    public @NotNull LongsPair withFirst(long first) {
        return LongsPair.of(first, second);
    }

    public @NotNull LongsPair withSecond(long second) {
        return LongsPair.of(first, second);
    }

    public @NotNull LongsPair swap() {
        return LongsPair.of(second, first);
    }

    public @NotNull LongsPair map(@NotNull LongUnaryOperator convertFirst, @NotNull LongUnaryOperator convertSecond) {
        return LongsPair.of(convertFirst.applyToLong(first), convertSecond.applyToLong(second));
    }

    public @NotNull LongsPair mapFirst(@NotNull LongUnaryOperator convert) {
        return this.map(convert, second -> second);
    }

    public @NotNull LongsPair mapFirst(@NotNull LongBinaryOperator convert) {
        return LongsPair.of(convert.applyToLong(first, second), second);
    }

    public @NotNull LongsPair mapSecond(@NotNull LongUnaryOperator convert) {
        return this.map(first -> first, convert);
    }

    public @NotNull LongsPair mapSecond(@NotNull LongBinaryOperator convert) {
        return LongsPair.of(first, convert.applyToLong(first, second));
    }

    public <T> @NotNull T mapToObj(@NotNull BiLongFunction<T> convert) {
        return convert.apply(first, second);
    }

    public long mapToLong(@NotNull LongBinaryOperator convert) {
        return convert.applyToLong(first, second);
    }

    public boolean testFirst(@NotNull LongPredicate predicate) {
        return predicate.test(first);
    }

    public boolean testSecond(@NotNull LongPredicate predicate) {
        return predicate.test(second);
    }

    public boolean test(@NotNull BiLongPredicate predicate) {
        return predicate.test(first, second);
    }

    public void apply(@NotNull BiLongConsumer action) {
        action.accept(first, second);
    }

    public @NotNull Stream<Long> stream() {
        return Stream.of(first, second);
    }

    public @NotNull List<Long> toList() {
        return Arrays.asList(first, second);
    }

    public long @NotNull[] toArray() {
        return new long[] { first, second };
    }

    public @NotNull Long @NotNull[] toLongArray() {
        return new Long[] { first, second };
    }

    @Override
    public String toString() {
        return "(%s, %s)".formatted(first, second);
    }
}
