package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiConsumer;

/**
 * Represents an operation that accepts two {@code short} arguments and returns no
 * result. Unlike most other functional interfaces, {@code ShortConsumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Consumer.java", date = "2024-09-02T09:14:55.654334600Z")
public interface BiShortConsumer extends BiConsumer<Short, Short> {
    /**
     * Performs this operation on the {@code short} arguments.
     */
    void accept(short left, short right);

    @Override
    default void accept(Short left, Short right) {
        this.accept((short) left, (short) right);
    }
}
