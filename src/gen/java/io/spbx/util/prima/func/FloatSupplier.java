package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Supplier;

/**
 * Represents a supplier of {@code float}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Supplier.java", date = "2024-09-02T09:14:55.645332200Z")
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
