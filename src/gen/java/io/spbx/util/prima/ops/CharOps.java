package io.spbx.util.prima.ops;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import io.spbx.util.prima.func.CharPredicate;
import io.spbx.util.prima.func.CharBinaryOperator;
import io.spbx.util.prima.func.CharUnaryOperator;

/**
 * Utility operations for {@code char}s.
 */
@Generated(value = "$Type$Ops.java", date = "2024-09-20T09:36:23.347893159Z")
public class CharOps {

    public static final CharUnaryOperator CHAR_TO_LOWER = Character::toLowerCase;
    public static final CharUnaryOperator CHAR_TO_UPPER = Character::toUpperCase;
    public static final CharUnaryOperator CHAR_TO_ASCII_LOWER = CharOps::toAsciiLowerCase;
    public static final CharUnaryOperator CHAR_TO_ASCII_UPPER = CharOps::toAsciiUpperCase;
    public static final CharPredicate CHAR_IS_ASCII_LOWER_LETTER = CharOps::isAsciiLowerCase;
    public static final CharPredicate CHAR_IS_ASCII_UPPER_LETTER = CharOps::isAsciiUpperCase;

    public static boolean isAsciiLowerCase(char val) {
        return 'a' <= val && val <= 'z';
    }

    public static boolean isAsciiUpperCase(char val) {
        return 'A' <= val && val <= 'Z';
    }

    public static char toAsciiLowerCase(char val) {
        return isAsciiUpperCase(val) ? (char) (val + 32) : val;  // 32 = 'a' - 'A'
    }

    public static char toAsciiUpperCase(char val) {
        return isAsciiLowerCase(val) ? (char) (val - 32) : val;  // 32 = 'a' - 'A'
    }

    /* Range array */

    public static char[] range(char end) {
        return range((char) 0, end);
    }

    public static char[] range(char start, char end) {
        char[] array = new char[(int) Math.abs(end - start)];
        for (int i = 0, step = start <= end ? 1 : -1; i < array.length; i++, start += step) {
            array[i] = start;
        }
        return array;
    }

    /* Array search */

    public static int indexOf(char[] values, CharPredicate check) {
        return indexOf(values, check, 0, values.length, -1);
    }

    public static int indexOf(char[] values, CharPredicate check, int from, int to, int def) {
        assert from >= 0 && from <= values.length : "From index is out of array bounds: %d".formatted(from);
        assert def < 0 || def >= values.length : "Default index can't be within array bounds: %d".formatted(def);
        for (int i = from; i < to; ++i) {
            if (check.test(values[i])) {
                return i;
            }
        }
        return def;
    }

    /* Array coercion */

    public static byte[] coerceToByteArray(char[] values) {
        byte[] bytes = new byte[values.length];
        for (int i = 0; i < values.length; i++) {
            bytes[i] = (byte) values[i];
        }
        return bytes;
    }

    public static int[] coerceToIntArray(char[] values) {
        int[] ints = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            ints[i] = (int) values[i];
        }
        return ints;
    }

    public static long[] coerceToLongArray(char[] values) {
        long[] longs = new long[values.length];
        for (int i = 0; i < values.length; i++) {
            longs[i] = (long) values[i];
        }
        return longs;
    }

    /* Array bit-level conversions */

    public static final int BYTES = Character.BYTES;

    public static byte[] toBigEndianBytes(char[] array) {
        java.nio.ByteBuffer byteBuffer = java.nio.ByteBuffer.allocate(array.length * Character.BYTES);
        byteBuffer.asCharBuffer().put(array);
        return byteBuffer.array();
    }

    public static char[] fromBigEndianBytes(byte[] bytes) {
        assert bytes.length % BYTES == 0 : "Size mismatch on conversion to char[]: " + bytes.length;
        char[] array = new char[bytes.length / BYTES];
        for (int i = 0, j = 0; i < array.length; i++, j += BYTES) {
            array[i] = valueOfBigEndianBytes(bytes, j);
        }
        return array;
    }

    public static char valueOfBigEndianBytes(byte[] bytes) {
        return valueOfBigEndianBytes(bytes, 0);
    }

    public static byte[] toBigEndianBytes(char value) {
        return new byte[] {(byte) (value >> 8), (byte) value};
    }

    public static char valueOfBigEndianBytes(byte[] bytes, int start) {
        assert start + BYTES <= bytes.length : "Array too small: %s < %s".formatted(bytes.length, start + BYTES);
        return valueOfBigEndianBytes(bytes[start], bytes[start + 1]);
    }

    public static char valueOfBigEndianBytes(byte b1, byte b2) {
        return (char) ((b1 << 8) | (b2 & 0xFF));
    }

    /* Java NIO buffers */

    // https://stackoverflow.com/questions/679298/gets-byte-array-from-a-bytebuffer-in-java
    private static char[] remainingChars(java.nio.CharBuffer buffer) {
        char[] chars = new char[buffer.remaining()];
        buffer.get(chars, 0, chars.length);
        return chars;
    }
}
