package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BinaryOperator;

/**
 * Represents an operation upon two <code>char</code>-valued operands and producing a
 * <code>char</code>-valued result.   This is the primitive type specialization of
 * {@link BinaryOperator} for <code>char</code>.
 */
@FunctionalInterface
@Generated(value = "$Type$BinaryOperator.java", date = "2024-09-02T09:14:55.627328100Z")
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
