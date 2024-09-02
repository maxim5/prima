package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;

/**
 * Represents a function that accepts two arguments and produces a <code>int</code> result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an <code>int</code>
 * as well as the result.
 *
 * @param <T> the type of one of the arguments to the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see ObjIntFunction
 * @see IntFunction
 * @see BiToIntFunction
 */
@FunctionalInterface
@Generated(value = "Obj$Type$To$Type$Function.java", date = "2024-09-02T09:14:55.674339300Z")
public interface ObjIntToIntFunction<T> extends ObjIntFunction<T, Integer>, BiToIntFunction<T, Integer> {
    /**
     * Applies this function to the given arguments.
     *
     * @param left the first function argument
     * @param right the second function argument
     * @return the function result
     */
    int applyToInt(T left, int right);

    @Override
    default Integer apply(T left, int right) {
        return applyToInt(left, right);
    }

    @Override
    default int applyToInt(T left, Integer right) {
        return applyToInt(left, right);
    }

    @Override
    default Integer apply(T left, Integer right) {
        return applyToInt(left, right);
    }
}
