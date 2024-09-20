package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Function;

/**
 * Represents a function that produces a primitive {@code $type$}-valued result.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface To$Type$Function<T> extends Function<T, $TypeWrap$> {
    /**
     * Applies this function to the given argument.
     */
    $type$ applyTo$Type$(T value);

    @Override
    default $TypeWrap$ apply(T value) {
        return applyTo$Type$(value);
    }
}
