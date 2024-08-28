package io.spbx.util.prima.wrap;

import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple mutable wrapper around <code>float</code>.
 */
@Generated(value = "$Type$sPair.java", date = "2024-08-25T16:01:42.024051900Z")
public record FloatsPair(float first, float second) {
    public static @NotNull FloatsPair of(float first, float second) {
        return new FloatsPair(first, second);
    }

    public static @NotNull FloatsPair of(float @NotNull[] array) {
        assert array.length == 2 : "Invalid array to create a pair from: length=%d".formatted(array.length);
        return new FloatsPair(array[0], array[1]);
    }

    public @NotNull FloatsPair withFirst(float first) {
        return FloatsPair.of(first, second);
    }

    public @NotNull FloatsPair withSecond(float second) {
        return FloatsPair.of(first, second);
    }

    public @NotNull FloatsPair swap() {
        return FloatsPair.of(second, first);
    }

    public @NotNull Stream<Float> stream() {
        return Stream.of(first, second);
    }

    public @NotNull List<Float> toList() {
        return Arrays.asList(first, second);
    }

    public float @NotNull[] toArray() {
        return new float[] { first, second };
    }

    public @NotNull Float @NotNull[] toFloatArray() {
        return new Float[] { first, second };
    }

    @Override
    public String toString() {
        return "(%s, %s)".formatted(first, second);
    }
}
