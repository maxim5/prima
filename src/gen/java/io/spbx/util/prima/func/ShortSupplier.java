package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Supplier;

/**
 * Represents a supplier of {@code short}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Supplier.java", date = "2024-09-02T09:14:55.645332200Z")
public interface ShortSupplier extends
    Supplier<Short> {
    /**
     * Returns the {@code short} result.
     */
    short getAsShort();

    @Override
    default Short get() {
        return this.getAsShort();
    }
}
