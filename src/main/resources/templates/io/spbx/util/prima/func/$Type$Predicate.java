package io.spbx.util.prima.func;

/*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
import org.jetbrains.annotations.NotNull;
/*= end =*/

import javax.annotation.processing.Generated;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * A simple predicate for the primitive <code>$type$</code> values.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface $Type$Predicate extends
        /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
        java.util.function.$Type$Predicate,
        /*= end =*/
        Predicate<$TypeWrap$>,
        Function<$TypeWrap$, Boolean> {
    /**
     * Evaluates this predicate on the given argument.
     */
    boolean test($type$ value);

    @Override
    default boolean test($TypeWrap$ value) {
        return this.test(($type$) value);
    }

    @Override
    default Boolean apply($TypeWrap$ value) {
        return this.test(($type$) value);
    }

    /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
    @Override
    default @NotNull $Type$Predicate negate() {
        return value -> !test(value);
    }
    
    @Override
    default @NotNull $Type$Predicate and(@NotNull java.util.function.$Type$Predicate that) {
        return value -> this.test(value) && that.test(value);
    }

    @Override
    default @NotNull $Type$Predicate and(@NotNull Predicate<? super $TypeWrap$> that) {
        return value -> this.test(value) && that.test(value);
    }

    @Override
    default @NotNull $Type$Predicate or(@NotNull java.util.function.$Type$Predicate that) {
        return value -> this.test(value) || that.test(value);
    }

    @Override
    default @NotNull $Type$Predicate or(@NotNull Predicate<? super $TypeWrap$> that) {
        return value -> this.test(value) || that.test(value);
    }
    /*= end =*/
}
