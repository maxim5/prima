package io.spbx.util.prima.wrap;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

/**
 * A simple mutable wrapper around <code>byte</code>.
 */
@Generated(value = "Mutable$Type$.java", date = "2024-09-04T12:43:13.928459100Z")
public class MutableByte {
    public byte value = 0;

    public MutableByte() {
    }

    public MutableByte(byte value) {
        this.value = value;
    }

    public static @NotNull MutableByte newMutableByte() {
        return new MutableByte();
    }

    public static @NotNull MutableByte of(byte value) {
        return new MutableByte(value);
    }

    public static @NotNull MutableByte of(@Nullable Byte value) {
        return new MutableByte(value != null ? value : 0);
    }

    public byte value() {
        return value;
    }

    public void set(byte value) {
        this.value = value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void update(byte delta) {
        value += delta;
    }

    public void reset() {
        value = 0;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof MutableByte that && this.value == that.value;
    }

    @Override
    public int hashCode() {
        return Byte.hashCode(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
