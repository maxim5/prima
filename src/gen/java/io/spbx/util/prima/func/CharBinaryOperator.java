package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BinaryOperator;

/**
 * Represents an operation upon two {@code char}-valued operands and producing a
 * {@code char}-valued result. This is the primitive type specialization of
 * {@link BinaryOperator} for {@code char}.
 */
@FunctionalInterface
@Generated(value = "$Type$BinaryOperator.java", date = "2024-09-20T09:36:23.439922515Z")
public interface CharBinaryOperator extends
        BinaryOperator<Character>,
        ObjCharFunction<Character, Character> {
    /**
     * Applies this operator to the given operands.
     */
    char applyToChar(char left, char right);

    @Override
    default Character apply(Character left, Character right) {
        return applyToChar(left, right);
    }

    @Override
    default Character apply(Character left, char right) {
        return this.applyToChar(left, right);
    }
}
