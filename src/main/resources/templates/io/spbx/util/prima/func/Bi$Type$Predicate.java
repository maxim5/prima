package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiPredicate;

/**
 * Represents a predicate (boolean-valued function) of two {@code $type$}-valued.
 * This is the two-arity specialization of {@link Predicate}.
 * This is the primitive type specialization of {@link BiPredicate} for {@code $type$}.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface Bi$Type$Predicate extends BiPredicate<$TypeWrap$, $TypeWrap$>, Obj$Type$Function<$TypeWrap$, Boolean>, Bi$Type$Function<Boolean> {
    /**
     * Evaluates this predicate on the {@code $type$} arguments.
     */
    boolean test($type$ left, $type$ right);

    @Override
    default boolean test($TypeWrap$ left, $TypeWrap$ right) {
        return test(left, right);
    }

    @Override
    default Boolean apply($TypeWrap$ left, $type$ right) {
        return test(($type$) left, right);
    }

    @Override
    default Boolean apply($type$ left, $type$ right) {
        return test(left, right);
    }

    @Override
    default Boolean apply($TypeWrap$ left, $TypeWrap$ right) {
        return test(($type$) left, ($type$) right);
    }
}
