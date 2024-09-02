package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a function that accepts two primitive <code>$type$</code>-valued arguments
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface Bi$Type$Function<R> extends BiFunction<$TypeWrap$, $TypeWrap$, R> {
    /**
     * Applies this function to the given arguments.
     */
    R apply($type$ left, $type$ right);

    @Override
    default R apply($TypeWrap$ left, $TypeWrap$ right) {
        return this.apply(($type$) left, ($type$) right);
    }
}
