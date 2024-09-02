package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Supplier;

/**
 * Represents a supplier of {@code char}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Supplier.java", date = "2024-09-02T09:14:55.645332200Z")
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
