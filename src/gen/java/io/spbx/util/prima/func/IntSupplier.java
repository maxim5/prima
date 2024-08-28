package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Supplier;

/**
 * Represents a supplier of {@code int}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Supplier.java", date = "2024-08-25T16:01:41.971040200Z")
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
