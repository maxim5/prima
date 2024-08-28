package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents a supplier of {@code byte}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Consumer.java", date = "2024-08-25T16:01:41.950035300Z")
public interface ByteConsumer extends
    Consumer<Byte> {
    /**
     * Returns the {@code byte} result.
     */
    void accept(byte value);

    @Override
    default void accept(Byte value) {
        this.accept((byte) value);
    }
}
