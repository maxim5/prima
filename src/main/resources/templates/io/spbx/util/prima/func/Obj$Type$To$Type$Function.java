package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;

/**
 * Represents a function that accepts two arguments and produces a {@code $type$} result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an {@code $type$}
 * as well as the result.
 *
 * @param <T> the type of one of the arguments to the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see Obj$Type$Function
 * @see $Type$Function
 * @see BiTo$Type$Function
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface Obj$Type$To$Type$Function<T> extends Obj$Type$Function<T, $TypeWrap$>, BiTo$Type$Function<T, $TypeWrap$> {
    /**
     * Applies this function to the given arguments.
     *
     * @param left the first function argument
     * @param right the second function argument
     * @return the function result
     */
    $type$ applyTo$Type$(T left, $type$ right);

    @Override
    default $TypeWrap$ apply(T left, $type$ right) {
        return applyTo$Type$(left, right);
    }

    @Override
    default $type$ applyTo$Type$(T left, $TypeWrap$ right) {
        return applyTo$Type$(left, right);
    }

    @Override
    default $TypeWrap$ apply(T left, $TypeWrap$ right) {
        return applyTo$Type$(left, right);
    }
}
