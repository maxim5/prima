package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Supplier;

/**
 * Represents a supplier of {@code $type$}-valued results.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface $Type$Supplier extends
    /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
    java.util.function.$Type$Supplier,
    /*= end =*/
    Supplier<$TypeWrap$> {
    /**
     * Returns the {@code $type$} result.
     */
    /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
    @Override
    /*= end =*/
    $type$ getAs$Type$();

    @Override
    default $TypeWrap$ get() {
        return this.getAs$Type$();
    }
}
