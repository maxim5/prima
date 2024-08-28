package io.spbx.util.prima.wrap;

import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple mutable wrapper around <code>$type$</code>.
 */
@Generated(value = "$source_template$", date = "$now$")
public record $Type$sPair($type$ first, $type$ second) {
    public static @NotNull $Type$sPair of($type$ first, $type$ second) {
        return new $Type$sPair(first, second);
    }

    public static @NotNull $Type$sPair of($type$ @NotNull[] array) {
        assert array.length == 2 : "Invalid array to create a pair from: length=%d".formatted(array.length);
        return new $Type$sPair(array[0], array[1]);
    }

    public @NotNull $Type$sPair withFirst($type$ first) {
        return $Type$sPair.of(first, second);
    }

    public @NotNull $Type$sPair withSecond($type$ second) {
        return $Type$sPair.of(first, second);
    }

    public @NotNull $Type$sPair swap() {
        return $Type$sPair.of(second, first);
    }

    public @NotNull Stream<$TypeWrap$> stream() {
        return Stream.of(first, second);
    }

    public @NotNull List<$TypeWrap$> toList() {
        return Arrays.asList(first, second);
    }

    public $type$ @NotNull[] toArray() {
        return new $type$[] { first, second };
    }

    public @NotNull $TypeWrap$ @NotNull[] to$TypeWrap$Array() {
        return new $TypeWrap$[] { first, second };
    }

    @Override
    public String toString() {
        return "(%s, %s)".formatted(first, second);
    }
}
