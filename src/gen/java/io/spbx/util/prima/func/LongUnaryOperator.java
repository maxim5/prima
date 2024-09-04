package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.UnaryOperator;

/**
 * Represents an operation on a single <code>long</code>-valued operand that produces
 * an <code>long</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "$Type$UnaryOperator.java", date = "2024-09-04T12:43:13.869447200Z")
public interface LongUnaryOperator extends
        java.util.function.LongUnaryOperator,
        UnaryOperator<Long>, LongFunction<Long>, ToLongFunction<Long> {
    /**
     * Applies this operator to the given operands.
     */
    long applyToLong(long operand);

    @Override
    default Long apply(long value) {
        return this.applyToLong(value);
    }

    @Override
    default Long apply(Long value) {
        return this.applyToLong(value);
    }

    @Override
    default long applyToLong(Long value) {
        return this.applyToLong((long) value);
    }

    @Override
    default long applyAsLong(long operand) {
        return this.applyToLong(operand);
    }
}
