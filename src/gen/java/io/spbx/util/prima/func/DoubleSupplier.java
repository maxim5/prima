package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Supplier;

/**
 * Represents a supplier of {@code double}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Supplier.java", date = "2024-09-20T09:36:23.427674666Z")
public interface DoubleSupplier extends
    java.util.function.DoubleSupplier,
    Supplier<Double> {
    /**
     * Returns the {@code double} result.
     */
    @Override
    double getAsDouble();

    @Override
    default Double get() {
        return this.getAsDouble();
    }
}
