package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiConsumer;

/**
 * Represents an operation that accepts two {@code float} arguments and returns no
 * result. Unlike most other functional interfaces, {@code FloatConsumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Consumer.java", date = "2024-09-02T09:14:55.654334600Z")
public interface BiFloatConsumer extends BiConsumer<Float, Float> {
    /**
     * Performs this operation on the {@code float} arguments.
     */
    void accept(float left, float right);

    @Override
    default void accept(Float left, Float right) {
        this.accept((float) left, (float) right);
    }
}
