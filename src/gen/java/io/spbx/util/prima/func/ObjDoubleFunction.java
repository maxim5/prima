package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two arguments and produces a result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an {@code double}.
 *
 * @param <T> the type of one of the arguments to the function
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see DoubleFunction
 */
@FunctionalInterface
@Generated(value = "Obj$Type$Function.java", date = "2024-09-20T09:36:23.514506380Z")
public interface ObjDoubleFunction<T, R> extends BiFunction<T, Double, R> {
    /**
     * Applies this function to the given arguments.
     *
     * @param left the first function argument
     * @param right the second function argument
     * @return the function result
     */
    R apply(T left, double right);

    @Override
    default R apply(T left, Double right) {
        return apply(left, (double) right);
    }
}
