package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.UnaryOperator;

/**
 * Represents an operation on a single <code>char</code>-valued operand that produces
 * an <code>char</code>-valued result.
 */
@FunctionalInterface
@Generated(value = "$Type$UnaryOperator.java", date = "2024-09-02T09:14:55.650333600Z")
public interface CharUnaryOperator extends
        UnaryOperator<Character>, CharFunction<Character>, ToCharFunction<Character> {
    /**
     * Applies this operator to the given operands.
     */
    char applyToChar(char operand);

    @Override
    default Character apply(char value) {
        return this.applyToChar(value);
    }

    @Override
    default Character apply(Character value) {
        return this.applyToChar(value);
    }

    @Override
    default char applyToChar(Character value) {
        return this.applyToChar((char) value);
    }
}
