package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents a supplier of {@code long}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Consumer.java", date = "2024-08-25T16:01:41.950035300Z")
public interface LongConsumer extends
    java.util.function.LongConsumer,
    Consumer<Long> {
    /**
     * Returns the {@code long} result.
     */
    @Override
    void accept(long value);

    @Override
    default void accept(Long value) {
        this.accept((long) value);
    }
}
