package io.spbx.util.prima.wrap;

import io.spbx.util.prima.func.Bi$Type$Consumer;
import io.spbx.util.prima.func.Bi$Type$Function;
import io.spbx.util.prima.func.Bi$Type$Predicate;
import io.spbx.util.prima.func.$Type$BinaryOperator;
import io.spbx.util.prima.func.$Type$Predicate;
import io.spbx.util.prima.func.$Type$UnaryOperator;
import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A simple immutable pair of two <code>$type$</code> values.
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

    public @NotNull $Type$sPair map(@NotNull $Type$UnaryOperator convertFirst, @NotNull $Type$UnaryOperator convertSecond) {
        return $Type$sPair.of(convertFirst.applyTo$Type$(first), convertSecond.applyTo$Type$(second));
    }

    public @NotNull $Type$sPair mapFirst(@NotNull $Type$UnaryOperator convert) {
        return this.map(convert, second -> second);
    }

    public @NotNull $Type$sPair mapFirst(@NotNull $Type$BinaryOperator convert) {
        return $Type$sPair.of(convert.applyTo$Type$(first, second), second);
    }

    public @NotNull $Type$sPair mapSecond(@NotNull $Type$UnaryOperator convert) {
        return this.map(first -> first, convert);
    }

    public @NotNull $Type$sPair mapSecond(@NotNull $Type$BinaryOperator convert) {
        return $Type$sPair.of(first, convert.applyTo$Type$(first, second));
    }

    public <T> @NotNull T mapToObj(@NotNull Bi$Type$Function<T> convert) {
        return convert.apply(first, second);
    }

    public $type$ mapTo$Type$(@NotNull $Type$BinaryOperator convert) {
        return convert.applyTo$Type$(first, second);
    }

    public boolean testFirst(@NotNull $Type$Predicate predicate) {
        return predicate.test(first);
    }

    public boolean testSecond(@NotNull $Type$Predicate predicate) {
        return predicate.test(second);
    }

    public boolean test(@NotNull Bi$Type$Predicate predicate) {
        return predicate.test(first, second);
    }

    public void apply(@NotNull Bi$Type$Consumer action) {
        action.accept(first, second);
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
