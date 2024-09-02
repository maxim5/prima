package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiConsumer;

/**
 * Represents an operation that accepts two {@code $type$} arguments and returns no
 * result. Unlike most other functional interfaces, {@code $Type$Consumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface Bi$Type$Consumer extends BiConsumer<$TypeWrap$, $TypeWrap$> {
    /**
     * Performs this operation on the {@code $type$} arguments.
     */
    void accept($type$ left, $type$ right);

    @Override
    default void accept($TypeWrap$ left, $TypeWrap$ right) {
        this.accept(($type$) left, ($type$) right);
    }
}
