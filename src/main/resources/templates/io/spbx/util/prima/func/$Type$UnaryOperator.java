package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.UnaryOperator;

/**
 * Represents an operation on a single {@code $type$}-valued operand that produces
 * an {@code $type$}-valued result.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface $Type$UnaryOperator extends
        /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
        java.util.function.$Type$UnaryOperator,
        /*= end =*/
        UnaryOperator<$TypeWrap$>, $Type$Function<$TypeWrap$>, To$Type$Function<$TypeWrap$> {
    /**
     * Applies this operator to the given operands.
     */
    $type$ applyTo$Type$($type$ operand);

    @Override
    default $TypeWrap$ apply($type$ value) {
        return this.applyTo$Type$(value);
    }

    @Override
    default $TypeWrap$ apply($TypeWrap$ value) {
        return this.applyTo$Type$(value);
    }

    @Override
    default $type$ applyTo$Type$($TypeWrap$ value) {
        return this.applyTo$Type$(($type$) value);
    }

    /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
    @Override
    default $type$ applyAs$Type$($type$ operand) {
        return this.applyTo$Type$(operand);
    }
    /*= end =*/
}
