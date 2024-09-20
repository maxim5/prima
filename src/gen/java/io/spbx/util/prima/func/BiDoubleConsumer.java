package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiConsumer;

/**
 * Represents an operation that accepts two {@code double} arguments and returns no
 * result. Unlike most other functional interfaces, {@code DoubleConsumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Consumer.java", date = "2024-09-20T09:36:23.490725893Z")
public interface BiDoubleConsumer extends BiConsumer<Double, Double> {
    /**
     * Performs this operation on the {@code double} arguments.
     */
    void accept(double left, double right);

    @Override
    default void accept(Double left, Double right) {
        this.accept((double) left, (double) right);
    }
}
