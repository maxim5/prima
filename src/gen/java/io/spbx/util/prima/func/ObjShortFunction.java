package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two arguments and produces a result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an <code>short</code>.
 *
 * @param <T> the type of one of the arguments to the function
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see ShortFunction
 */
@FunctionalInterface
@Generated(value = "Obj$Type$Function.java", date = "2024-09-04T12:43:13.893451400Z")
public interface ObjShortFunction<T, R> extends BiFunction<T, Short, R> {
    /**
     * Applies this function to the given arguments.
     *
     * @param left the first function argument
     * @param right the second function argument
     * @return the function result
     */
    R apply(T left, short right);

    @Override
    default R apply(T left, Short right) {
        return apply(left, (short) right);
    }
}
