package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;

/**
 * Represents a function that accepts two arguments and produces a {@code double} result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an {@code double}
 * as well as the result.
 *
 * @param <T> the type of one of the arguments to the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see ObjDoubleFunction
 * @see DoubleFunction
 * @see BiToDoubleFunction
 */
@FunctionalInterface
@Generated(value = "Obj$Type$To$Type$Function.java", date = "2024-09-20T09:36:23.521658274Z")
public interface ObjDoubleToDoubleFunction<T> extends ObjDoubleFunction<T, Double>, BiToDoubleFunction<T, Double> {
    /**
     * Applies this function to the given arguments.
     *
     * @param left the first function argument
     * @param right the second function argument
     * @return the function result
     */
    double applyToDouble(T left, double right);

    @Override
    default Double apply(T left, double right) {
        return applyToDouble(left, right);
    }

    @Override
    default double applyToDouble(T left, Double right) {
        return applyToDouble(left, right);
    }

    @Override
    default Double apply(T left, Double right) {
        return applyToDouble(left, right);
    }
}
