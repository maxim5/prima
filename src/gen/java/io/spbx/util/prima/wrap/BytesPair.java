package io.spbx.util.prima.wrap;

import io.spbx.util.prima.func.BiByteConsumer;
import io.spbx.util.prima.func.BiByteFunction;
import io.spbx.util.prima.func.BiBytePredicate;
import io.spbx.util.prima.func.ByteBinaryOperator;
import io.spbx.util.prima.func.BytePredicate;
import io.spbx.util.prima.func.ByteUnaryOperator;
import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple immutable pair of two <code>byte</code> values.
 */
@Generated(value = "$Type$sPair.java", date = "2024-09-04T12:43:13.923459200Z")
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

    public @NotNull BytesPair map(@NotNull ByteUnaryOperator convertFirst, @NotNull ByteUnaryOperator convertSecond) {
        return BytesPair.of(convertFirst.applyToByte(first), convertSecond.applyToByte(second));
    }

    public @NotNull BytesPair mapFirst(@NotNull ByteUnaryOperator convert) {
        return this.map(convert, second -> second);
    }

    public @NotNull BytesPair mapFirst(@NotNull ByteBinaryOperator convert) {
        return BytesPair.of(convert.applyToByte(first, second), second);
    }

    public @NotNull BytesPair mapSecond(@NotNull ByteUnaryOperator convert) {
        return this.map(first -> first, convert);
    }

    public @NotNull BytesPair mapSecond(@NotNull ByteBinaryOperator convert) {
        return BytesPair.of(first, convert.applyToByte(first, second));
    }

    public <T> @NotNull T mapToObj(@NotNull BiByteFunction<T> convert) {
        return convert.apply(first, second);
    }

    public byte mapToByte(@NotNull ByteBinaryOperator convert) {
        return convert.applyToByte(first, second);
    }

    public boolean testFirst(@NotNull BytePredicate predicate) {
        return predicate.test(first);
    }

    public boolean testSecond(@NotNull BytePredicate predicate) {
        return predicate.test(second);
    }

    public boolean test(@NotNull BiBytePredicate predicate) {
        return predicate.test(first, second);
    }

    public void apply(@NotNull BiByteConsumer action) {
        action.accept(first, second);
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
