package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiConsumer;

/**
 * Represents an operation that accepts two {@code byte} arguments and returns no
 * result. Unlike most other functional interfaces, {@code ByteConsumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Consumer.java", date = "2024-09-20T09:36:23.490725893Z")
public interface BiByteConsumer extends BiConsumer<Byte, Byte> {
    /**
     * Performs this operation on the {@code byte} arguments.
     */
    void accept(byte left, byte right);

    @Override
    default void accept(Byte left, Byte right) {
        this.accept((byte) left, (byte) right);
    }
}
