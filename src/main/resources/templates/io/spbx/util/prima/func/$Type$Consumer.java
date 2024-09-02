package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents an operation that accepts a single {@code $type$} argument and returns no
 * result. Unlike most other functional interfaces, {@code $Type$Consumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface $Type$Consumer extends
    /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
    java.util.function.$Type$Consumer,
    /*= end =*/
    Consumer<$TypeWrap$> {
    /**
     * Performs this operation on the {@code $type$} argument.
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
