package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Supplier;

/**
 * Represents a supplier of {@code float}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Supplier.java", date = "2024-08-25T16:01:41.971040200Z")
public interface FloatSupplier extends
    Supplier<Float> {
    /**
     * Returns the {@code float} result.
     */
    float getAsFloat();

    @Override
    default Float get() {
        return this.getAsFloat();
    }
}
