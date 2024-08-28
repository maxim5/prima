package io.spbx.util.prima.wrap;

import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple mutable wrapper around <code>double</code>.
 */
@Generated(value = "$Type$sPair.java", date = "2024-08-25T16:01:42.024051900Z")
public record DoublesPair(double first, double second) {
    public static @NotNull DoublesPair of(double first, double second) {
        return new DoublesPair(first, second);
    }

    public static @NotNull DoublesPair of(double @NotNull[] array) {
        assert array.length == 2 : "Invalid array to create a pair from: length=%d".formatted(array.length);
        return new DoublesPair(array[0], array[1]);
    }

    public @NotNull DoublesPair withFirst(double first) {
        return DoublesPair.of(first, second);
    }

    public @NotNull DoublesPair withSecond(double second) {
        return DoublesPair.of(first, second);
    }

    public @NotNull DoublesPair swap() {
        return DoublesPair.of(second, first);
    }

    public @NotNull Stream<Double> stream() {
        return Stream.of(first, second);
    }

    public @NotNull List<Double> toList() {
        return Arrays.asList(first, second);
    }

    public double @NotNull[] toArray() {
        return new double[] { first, second };
    }

    public @NotNull Double @NotNull[] toDoubleArray() {
        return new Double[] { first, second };
    }

    @Override
    public String toString() {
        return "(%s, %s)".formatted(first, second);
    }
}
