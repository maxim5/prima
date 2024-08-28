package io.spbx.util.prima.wrap;

import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple mutable wrapper around <code>byte</code>.
 */
@Generated(value = "$Type$sPair.java", date = "2024-08-25T16:01:42.024051900Z")
public record BytesPair(byte first, byte second) {
    public static @NotNull BytesPair of(byte first, byte second) {
        return new BytesPair(first, second);
    }

    public static @NotNull BytesPair of(byte @NotNull[] array) {
        assert array.length == 2 : "Invalid array to create a pair from: length=%d".formatted(array.length);
        return new BytesPair(array[0], array[1]);
    }

    public @NotNull BytesPair withFirst(byte first) {
        return BytesPair.of(first, second);
    }

    public @NotNull BytesPair withSecond(byte second) {
        return BytesPair.of(first, second);
    }

    public @NotNull BytesPair swap() {
        return BytesPair.of(second, first);
    }

    public @NotNull Stream<Byte> stream() {
        return Stream.of(first, second);
    }

    public @NotNull List<Byte> toList() {
        return Arrays.asList(first, second);
    }

    public byte @NotNull[] toArray() {
        return new byte[] { first, second };
    }

    public @NotNull Byte @NotNull[] toByteArray() {
        return new Byte[] { first, second };
    }

    @Override
    public String toString() {
        return "(%s, %s)".formatted(first, second);
    }
}
