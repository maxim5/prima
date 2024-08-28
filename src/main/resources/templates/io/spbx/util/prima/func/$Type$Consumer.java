package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents a supplier of {@code $type$}-valued results.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface $Type$Consumer extends
    /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
    java.util.function.$Type$Consumer,
    /*= end =*/
    Consumer<$TypeWrap$> {
    /**
     * Returns the {@code $type$} result.
     */
    /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
    @Override
    /*= end =*/
    void accept($type$ value);

    @Override
    default void accept($TypeWrap$ value) {
        this.accept(($type$) value);
    }
}
