package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that accepts a primitive <code>$type$</code>-valued argument
 * and produces an {@link Object} result.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface $Type$Function<R> extends Function<$TypeWrap$, R> {
    /**
     * Applies this function to the given argument.
     */
    R apply($type$ value);

    @Override
    default R apply($TypeWrap$ value) {
        return this.apply(($type$) value);
    }
}
