package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents an operation that accepts a single {@code char} argument and returns no
 * result. Unlike most other functional interfaces, {@code CharConsumer} is expected
 * to operate via side-effects.
 */
@FunctionalInterface
@Generated(value = "$Type$Consumer.java", date = "2024-09-04T12:43:13.845440700Z")
public interface CharConsumer extends
    Consumer<Character> {
    /**
     * Performs this operation on the {@code char} argument.
     */
    void accept(char value);

    @Override
    default void accept(Character value) {
        this.accept((char) value);
    }
}
