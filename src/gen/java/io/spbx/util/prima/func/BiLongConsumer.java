package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiConsumer;

/**
 * Represents an operation that accepts two {@code long} arguments and returns no
 * result. Unlike most other functional interfaces, {@code LongConsumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Consumer.java", date = "2024-09-04T12:43:13.875447400Z")
public interface BiLongConsumer extends BiConsumer<Long, Long> {
    /**
     * Performs this operation on the {@code long} arguments.
     */
    void accept(long left, long right);

    @Override
    default void accept(Long left, Long right) {
        this.accept((long) left, (long) right);
    }
}
