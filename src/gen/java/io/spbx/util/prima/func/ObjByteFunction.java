package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two arguments and produces a result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an <code>byte</code>.
 *
 * @param <T> the type of one of the arguments to the function
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see ByteFunction
 */
@FunctionalInterface
@Generated(value = "Obj$Type$Function.java", date = "2024-08-25T16:01:41.985043800Z")
public interface ObjByteFunction<T, R> extends BiFunction<T, Byte, R> {
    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param value the second function argument
     * @return the function result
     */
    R apply(T t, byte value);

    @Override
    default R apply(T t, Byte value) {
        return apply(t, (byte) value);
    }
}
