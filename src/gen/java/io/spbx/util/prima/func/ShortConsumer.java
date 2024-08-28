package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents a supplier of {@code short}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Consumer.java", date = "2024-08-25T16:01:41.950035300Z")
public interface ShortConsumer extends
    Consumer<Short> {
    /**
     * Returns the {@code short} result.
     */
    void accept(short value);

    @Override
    default void accept(Short value) {
        this.accept((short) value);
    }
}
