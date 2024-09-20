package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;

/**
 * Represents a function that accepts two arguments and produces a {@code char} result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an {@code char}
 * as well as the result.
 *
 * @param <T> the type of one of the arguments to the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see ObjCharFunction
 * @see CharFunction
 * @see BiToCharFunction
 */
@FunctionalInterface
@Generated(value = "Obj$Type$To$Type$Function.java", date = "2024-09-20T09:36:23.521658274Z")
public interface ObjCharToCharFunction<T> extends ObjCharFunction<T, Character>, BiToCharFunction<T, Character> {
    /**
     * Applies this function to the given arguments.
     *
     * @param left the first function argument
     * @param right the second function argument
     * @return the function result
     */
    char applyToChar(T left, char right);

    @Override
    default Character apply(T left, char right) {
        return applyToChar(left, right);
    }

    @Override
    default char applyToChar(T left, Character right) {
        return applyToChar(left, right);
    }

    @Override
    default Character apply(T left, Character right) {
        return applyToChar(left, right);
    }
}
