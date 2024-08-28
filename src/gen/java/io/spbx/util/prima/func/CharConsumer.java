package io.spbx.util.prima.func;

import javax.annotation.processing.Generated;
import java.util.function.Consumer;

/**
 * Represents a supplier of {@code char}-valued results.
 */
@FunctionalInterface
@Generated(value = "$Type$Consumer.java", date = "2024-08-25T16:01:41.950035300Z")
public interface CharConsumer extends
    Consumer<Character> {
    /**
     * Returns the {@code char} result.
     */
    void accept(char value);

    @Override
    default void accept(Character value) {
        this.accept((char) value);
    }
}
