package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiConsumer;

/**
 * Represents an operation that accepts two {@code int} arguments and returns no
 * result. Unlike most other functional interfaces, {@code IntConsumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Consumer.java", date = "2024-09-02T09:14:55.654334600Z")
public interface BiIntConsumer extends BiConsumer<Integer, Integer> {
    /**
     * Performs this operation on the {@code int} arguments.
     */
    void accept(int left, int right);

    @Override
    default void accept(Integer left, Integer right) {
        this.accept((int) left, (int) right);
    }
}
