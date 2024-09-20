package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;

/**
 * Represents a function that accepts two arguments and produces a {@code long} result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an {@code long}
 * as well as the result.
 *
 * @param <T> the type of one of the arguments to the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see ObjLongFunction
 * @see LongFunction
 * @see BiToLongFunction
 */
@FunctionalInterface
@Generated(value = "Obj$Type$To$Type$Function.java", date = "2024-09-20T09:36:23.521658274Z")
public interface ObjLongToLongFunction<T> extends ObjLongFunction<T, Long>, BiToLongFunction<T, Long> {
    /**
     * Applies this function to the given arguments.
     *
     * @param left the first function argument
     * @param right the second function argument
     * @return the function result
     */
    long applyToLong(T left, long right);

    @Override
    default Long apply(T left, long right) {
        return applyToLong(left, right);
    }

    @Override
    default long applyToLong(T left, Long right) {
        return applyToLong(left, right);
    }

    @Override
    default Long apply(T left, Long right) {
        return applyToLong(left, right);
    }
}
