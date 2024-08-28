package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two arguments and produces a result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an <code>$type$</code>.
 *
 * @param <T> the type of one of the arguments to the function
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see $TypeWrap$Function
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface Obj$Type$Function<T, R> extends BiFunction<T, $TypeWrap$, R> {
    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param value the second function argument
     * @return the function result
     */
    R apply(T t, $type$ value);

    @Override
    default R apply(T t, $TypeWrap$ value) {
        return apply(t, ($type$) value);
    }
}
