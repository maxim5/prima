package io.spbx.util.prima.wrap;

import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple mutable wrapper around <code>char</code>.
 */
@Generated(value = "$Type$sPair.java", date = "2024-08-25T16:01:42.024051900Z")
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
