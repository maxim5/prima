package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;

/**
 * Represents a function that accepts two arguments and produces a <code>float</code> result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an <code>float</code>
 * as well as the result.
 *
 * @param <T> the type of one of the arguments to the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see ObjFloatFunction
 * @see FloatFunction
 * @see BiToFloatFunction
 */
@FunctionalInterface
@Generated(value = "Obj$Type$To$Type$Function.java", date = "2024-09-02T09:14:55.674339300Z")
public interface ObjFloatToFloatFunction<T> extends ObjFloatFunction<T, Float>, BiToFloatFunction<T, Float> {
    /**
     * Applies this function to the given arguments.
     *
     * @param left the first function argument
     * @param right the second function argument
     * @return the function result
     */
    float applyToFloat(T left, float right);

    @Override
    default Float apply(T left, float right) {
        return applyToFloat(left, right);
    }

    @Override
    default float applyToFloat(T left, Float right) {
        return applyToFloat(left, right);
    }

    @Override
    default Float apply(T left, Float right) {
        return applyToFloat(left, right);
    }
}
