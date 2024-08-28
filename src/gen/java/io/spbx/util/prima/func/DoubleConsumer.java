package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents a supplier of {@code double}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Consumer.java", date = "2024-08-25T16:01:41.950035300Z")
public interface DoubleConsumer extends
    java.util.function.DoubleConsumer,
    Consumer<Double> {
    /**
     * Returns the {@code double} result.
     */
    @Override
    void accept(double value);

    @Override
    default void accept(Double value) {
        this.accept((double) value);
    }
}
