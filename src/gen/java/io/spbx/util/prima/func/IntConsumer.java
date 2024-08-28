package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents a supplier of {@code int}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Consumer.java", date = "2024-08-25T16:01:41.950035300Z")
public interface IntConsumer extends
    java.util.function.IntConsumer,
    Consumer<Integer> {
    /**
     * Returns the {@code int} result.
     */
    @Override
    void accept(int value);

    @Override
    default void accept(Integer value) {
        this.accept((int) value);
    }
}
