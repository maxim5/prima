package io.spbx.util.prima.wrap;

import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple mutable wrapper around <code>long</code>.
 */
@Generated(value = "$Type$sPair.java", date = "2024-08-25T16:01:42.024051900Z")
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
