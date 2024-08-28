package io.spbx.util.prima.wrap;

import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple mutable wrapper around <code>int</code>.
 */
@Generated(value = "$Type$sPair.java", date = "2024-08-25T16:01:42.024051900Z")
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
