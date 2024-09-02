package io.spbx.util.prima.wrap;

import io.spbx.util.prima.func.BiCharConsumer;
import io.spbx.util.prima.func.BiCharFunction;
import io.spbx.util.prima.func.BiCharPredicate;
import io.spbx.util.prima.func.CharBinaryOperator;
import io.spbx.util.prima.func.CharPredicate;
import io.spbx.util.prima.func.CharUnaryOperator;
import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple immutable pair of two <code>char</code> values.
 */
@Generated(value = "$Type$sPair.java", date = "2024-09-02T09:14:55.693343900Z")
public record CharsPair(char first, char second) {
    public static @NotNull CharsPair of(char first, char second) {
        return new CharsPair(first, second);
    }

    public static @NotNull CharsPair of(char @NotNull[] array) {
        assert array.length == 2 : "Invalid array to create a pair from: length=%d".formatted(array.length);
        return new CharsPair(array[0], array[1]);
    }

    public @NotNull CharsPair withFirst(char first) {
        return CharsPair.of(first, second);
    }

    public @NotNull CharsPair withSecond(char second) {
        return CharsPair.of(first, second);
    }

    public @NotNull CharsPair swap() {
        return CharsPair.of(second, first);
    }

    public @NotNull CharsPair map(@NotNull CharUnaryOperator convertFirst, @NotNull CharUnaryOperator convertSecond) {
        return CharsPair.of(convertFirst.applyToChar(first), convertSecond.applyToChar(second));
    }

    public @NotNull CharsPair mapFirst(@NotNull CharUnaryOperator convert) {
        return this.map(convert, second -> second);
    }

    public @NotNull CharsPair mapFirst(@NotNull CharBinaryOperator convert) {
        return CharsPair.of(convert.applyToChar(first, second), second);
    }

    public @NotNull CharsPair mapSecond(@NotNull CharUnaryOperator convert) {
        return this.map(first -> first, convert);
    }

    public @NotNull CharsPair mapSecond(@NotNull CharBinaryOperator convert) {
        return CharsPair.of(first, convert.applyToChar(first, second));
    }

    public <T> @NotNull T mapToObj(@NotNull BiCharFunction<T> convert) {
        return convert.apply(first, second);
    }

    public char mapToChar(@NotNull CharBinaryOperator convert) {
        return convert.applyToChar(first, second);
    }

    public boolean testFirst(@NotNull CharPredicate predicate) {
        return predicate.test(first);
    }

    public boolean testSecond(@NotNull CharPredicate predicate) {
        return predicate.test(second);
    }

    public boolean test(@NotNull BiCharPredicate predicate) {
        return predicate.test(first, second);
    }

    public void apply(@NotNull BiCharConsumer action) {
        action.accept(first, second);
    }

    public @NotNull Stream<Character> stream() {
        return Stream.of(first, second);
    }

    public @NotNull List<Character> toList() {
        return Arrays.asList(first, second);
    }

    public char @NotNull[] toArray() {
        return new char[] { first, second };
    }

    public @NotNull Character @NotNull[] toCharacterArray() {
        return new Character[] { first, second };
    }

    @Override
    public String toString() {
        return "(%s, %s)".formatted(first, second);
    }
}
