package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents an operation that accepts a single {@code int} argument and returns no
 * result. Unlike most other functional interfaces, {@code IntConsumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "$Type$Consumer.java", date = "2024-09-02T09:14:55.632328700Z")
public interface IntConsumer extends
    java.util.function.IntConsumer,
    Consumer<Integer> {
    /**
     * Performs this operation on the {@code int} argument.
     */
    @Override
    void accept(int value);

    @Override
    default void accept(Integer value) {
        this.accept((int) value);
    }
}
