package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two primitive {@code int}-valued arguments
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Function.java", date = "2024-09-20T09:36:23.497470407Z")
public interface BiIntFunction<R> extends BiFunction<Integer, Integer, R> {
    /**
     * Applies this function to the given arguments.
     */
    R apply(int left, int right);

    @Override
    default R apply(Integer left, Integer right) {
        return this.apply((int) left, (int) right);
    }
}
