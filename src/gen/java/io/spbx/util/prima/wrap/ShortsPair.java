package io.spbx.util.prima.wrap;

import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple mutable wrapper around <code>short</code>.
 */
@Generated(value = "$Type$sPair.java", date = "2024-08-25T16:01:42.024051900Z")
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
