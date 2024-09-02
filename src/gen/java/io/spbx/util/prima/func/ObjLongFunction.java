package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two arguments and produces a result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an <code>long</code>.
 *
 * @param <T> the type of one of the arguments to the function
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see LongFunction
 */
@FunctionalInterface
@Generated(value = "Obj$Type$Function.java", date = "2024-09-02T09:14:55.670338700Z")
public interface ObjLongFunction<T, R> extends BiFunction<T, Long, R> {
    /**
     * Applies this function to the given arguments.
     *
     * @param left the first function argument
     * @param right the second function argument
     * @return the function result
     */
    R apply(T left, long right);

    @Override
    default R apply(T left, Long right) {
        return apply(left, (long) right);
    }
}
