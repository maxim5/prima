package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;

/**
 * Represents a function that accepts two arguments and produces a <code>short</code> result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an <code>short</code>
 * as well as the result.
 *
 * @param <T> the type of one of the arguments to the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see ObjShortFunction
 * @see ShortFunction
 * @see BiToShortFunction
 */
@FunctionalInterface
@Generated(value = "Obj$Type$To$Type$Function.java", date = "2024-09-02T09:14:55.674339300Z")
public interface ObjShortToShortFunction<T> extends ObjShortFunction<T, Short>, BiToShortFunction<T, Short> {
    /**
     * Applies this function to the given arguments.
     *
     * @param left the first function argument
     * @param right the second function argument
     * @return the function result
     */
    short applyToShort(T left, short right);

    @Override
    default Short apply(T left, short right) {
        return applyToShort(left, right);
    }

    @Override
    default short applyToShort(T left, Short right) {
        return applyToShort(left, right);
    }

    @Override
    default Short apply(T left, Short right) {
        return applyToShort(left, right);
    }
}
