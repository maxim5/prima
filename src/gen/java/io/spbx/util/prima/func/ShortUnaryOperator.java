package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.UnaryOperator;

/**
 * Represents an operation on a single <code>short</code>-valued operand that produces
 * an <code>short</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "$Type$UnaryOperator.java", date = "2024-09-04T12:43:13.869447200Z")
public interface ShortUnaryOperator extends
        UnaryOperator<Short>, ShortFunction<Short>, ToShortFunction<Short> {
    /**
     * Applies this operator to the given operands.
     */
    short applyToShort(short operand);

    @Override
    default Short apply(short value) {
        return this.applyToShort(value);
    }

    @Override
    default Short apply(Short value) {
        return this.applyToShort(value);
    }

    @Override
    default short applyToShort(Short value) {
        return this.applyToShort((short) value);
    }
}
