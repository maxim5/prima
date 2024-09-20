package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiFunction;

/**
 * Represents a binary function that produces a primitive {@code $type$}-valued result.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface BiTo$Type$Function<T, U> extends BiFunction<T, U, $TypeWrap$> {
    /**
     * Applies this function to the given arguments.
     */
    $type$ applyTo$Type$(T left, U right);

    @Override
    default $TypeWrap$ apply(T left, U right) {
        return applyTo$Type$(left, right);
    }
}
