package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Supplier;

/**
 * Represents a supplier of {@code int}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Supplier.java", date = "2024-09-20T09:36:23.427674666Z")
public interface IntSupplier extends
    java.util.function.IntSupplier,
    Supplier<Integer> {
    /**
     * Returns the {@code int} result.
     */
    @Override
    int getAsInt();

    @Override
    default Integer get() {
        return this.getAsInt();
    }
}
