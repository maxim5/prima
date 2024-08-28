package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents a supplier of {@code float}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Consumer.java", date = "2024-08-25T16:01:41.950035300Z")
public interface FloatConsumer extends
    Consumer<Float> {
    /**
     * Returns the {@code float} result.
     */
    void accept(float value);

    @Override
    default void accept(Float value) {
        this.accept((float) value);
    }
}
