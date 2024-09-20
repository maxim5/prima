package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two primitive {@code char}-valued arguments
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Function.java", date = "2024-09-20T09:36:23.497470407Z")
public interface BiCharFunction<R> extends BiFunction<Character, Character, R> {
    /**
     * Applies this function to the given arguments.
     */
    R apply(char left, char right);

    @Override
    default R apply(Character left, Character right) {
        return this.apply((char) left, (char) right);
    }
}
