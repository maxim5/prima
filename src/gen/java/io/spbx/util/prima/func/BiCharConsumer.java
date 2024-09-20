package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.BiConsumer;

/**
 * Represents an operation that accepts two {@code char} arguments and returns no
 * result. Unlike most other functional interfaces, {@code CharConsumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "Bi$Type$Consumer.java", date = "2024-09-20T09:36:23.490725893Z")
public interface BiCharConsumer extends BiConsumer<Character, Character> {
    /**
     * Performs this operation on the {@code char} arguments.
     */
    void accept(char left, char right);

    @Override
    default void accept(Character left, Character right) {
        this.accept((char) left, (char) right);
    }
}
