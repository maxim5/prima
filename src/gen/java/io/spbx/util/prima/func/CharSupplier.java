package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Supplier;

/**
 * Represents a supplier of {@code char}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Supplier.java", date = "2024-08-25T16:01:41.971040200Z")
public interface CharSupplier extends
    Supplier<Character> {
    /**
     * Returns the {@code char} result.
     */
    char getAsChar();

    @Override
    default Character get() {
        return this.getAsChar();
    }
}
