package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents an operation that accepts a single {@code float} argument and returns no
 * result. Unlike most other functional interfaces, {@code FloatConsumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "$Type$Consumer.java", date = "2024-09-04T12:43:13.845440700Z")
public interface FloatConsumer extends
    Consumer<Float> {
    /**
     * Performs this operation on the {@code float} argument.
     */
    void accept(float value);

    @Override
    default void accept(Float value) {
        this.accept((float) value);
    }
}
