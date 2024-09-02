package io.spbx.util.prima.wrap;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

/**
 * A simple mutable wrapper around <code>char</code>.
 */
@Generated(value = "Mutable$Type$.java", date = "2024-09-02T09:14:55.697343300Z")
public class MutableChar {
    public char value = 0;

    public MutableChar() {
    }

    public MutableChar(char value) {
        this.value = value;
    }

    public static @NotNull MutableChar newMutableChar() {
        return new MutableChar();
    }

    public static @NotNull MutableChar of(char value) {
        return new MutableChar(value);
    }

    public static @NotNull MutableChar of(@Nullable Character value) {
        return new MutableChar(value != null ? value : 0);
    }

    public char value() {
        return value;
    }

    public void set(char value) {
        this.value = value;
    }

    public void reset() {
        value = 0;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof MutableChar that && this.value == that.value;
    }

    @Override
    public int hashCode() {
        return Character.hashCode(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
