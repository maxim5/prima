package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;

/**
 * Represents a function that accepts two arguments and produces a <code>byte</code> result.
 * This is the specialization of {@link BiFunction}, one of the arguments for which is an <code>byte</code>
 * as well as the result.
 *
 * @param <T> the type of one of the arguments to the function
 *
 * @see java.util.function.Function
 * @see java.util.function.BiFunction
 * @see ObjByteFunction
 * @see ByteFunction
 * @see BiToByteFunction
 */
@FunctionalInterface
@Generated(value = "Obj$Type$To$Type$Function.java", date = "2024-09-02T09:14:55.674339300Z")
public interface ObjByteToByteFunction<T> extends ObjByteFunction<T, Byte>, BiToByteFunction<T, Byte> {
    /**
     * Applies this function to the given arguments.
     *
     * @param left the first function argument
     * @param right the second function argument
     * @return the function result
     */
    byte applyToByte(T left, byte right);

    @Override
    default Byte apply(T left, byte right) {
        return applyToByte(left, right);
    }

    @Override
    default byte applyToByte(T left, Byte right) {
        return applyToByte(left, right);
    }

    @Override
    default Byte apply(T left, Byte right) {
        return applyToByte(left, right);
    }
}
