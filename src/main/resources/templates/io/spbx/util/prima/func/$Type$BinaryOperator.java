package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BinaryOperator;

/**
 * Represents an operation upon two {@code $type$}-valued operands and producing a
 * {@code $type$}-valued result. This is the primitive type specialization of
 * {@link BinaryOperator} for {@code $type$}.
 */
@FunctionalInterface
@Generated(value = "$source_template$", date = "$now$")
public interface $Type$BinaryOperator extends
        /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
        java.util.function.$Type$BinaryOperator,
        /*= end =*/
        BinaryOperator<$TypeWrap$>,
        Obj$Type$Function<$TypeWrap$, $TypeWrap$> {
    /**
     * Applies this operator to the given operands.
     */
    $type$ applyTo$Type$($type$ left, $type$ right);

    @Override
    default $TypeWrap$ apply($TypeWrap$ left, $TypeWrap$ right) {
        return applyTo$Type$(left, right);
    }

    @Override
    default $TypeWrap$ apply($TypeWrap$ left, $type$ right) {
        return this.applyTo$Type$(left, right);
    }

    /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
    @Override
    default $type$ applyAs$Type$($type$ left, $type$ right) {
        return this.applyTo$Type$(left, right);
    }
    /*= end =*/
}
