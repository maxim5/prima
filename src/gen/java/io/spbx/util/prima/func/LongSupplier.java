package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Supplier;

/**
 * Represents a supplier of {@code long}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Supplier.java", date = "2024-09-20T09:36:23.427674666Z")
public interface LongSupplier extends
    java.util.function.LongSupplier,
    Supplier<Long> {
    /**
     * Returns the {@code long} result.
     */
    @Override
    long getAsLong();

    @Override
    default Long get() {
        return this.getAsLong();
    }
}
