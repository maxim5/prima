package io.spbx.util.prima.wrap;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

/**
 * A simple mutable wrapper around <code>$type$</code>.
 */
@Generated(value = "$source_template$", date = "$now$")
public class Mutable$Type$ {
    public $type$ value = 0;

    public Mutable$Type$() {
    }

    public Mutable$Type$($type$ value) {
        this.value = value;
    }

    public static @NotNull Mutable$Type$ newMutable$Type$() {
        return new Mutable$Type$();
    }

    public static @NotNull Mutable$Type$ of($type$ value) {
        return new Mutable$Type$(value);
    }

    public static @NotNull Mutable$Type$ of(@Nullable $TypeWrap$ value) {
        return new Mutable$Type$(value != null ? value : 0);
    }

    public $type$ value() {
        return value;
    }

    public void set($type$ value) {
        this.value = value;
    }

    /*= if ($type$ == int) || ($type$ == long) || ($type$ == short) || ($type$ == byte) =*/
    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void update($type$ delta) {
        value += delta;
    }
    /*= end =*/

    public void reset() {
        value = 0;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof Mutable$Type$ that && this.value == that.value;
    }

    @Override
    public int hashCode() {
        return $TypeWrap$.hashCode(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
