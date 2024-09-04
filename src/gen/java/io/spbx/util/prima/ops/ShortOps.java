package io.spbx.util.prima.ops;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import io.spbx.util.prima.func.ShortPredicate;
import io.spbx.util.prima.func.ShortBinaryOperator;
import io.spbx.util.prima.func.ShortUnaryOperator;

/**
 * Utility operations for <code>short</code>s.
 */
@Generated(value = "$Type$Ops.java", date = "2024-09-04T12:43:13.906454100Z")
public class ShortOps {
    public static final ShortBinaryOperator SHORT_ADD = (a, b) -> (short) (a + b);
    public static final ShortBinaryOperator SHORT_MUL = (a, b) -> (short) (a * b);
    public static final ShortBinaryOperator SHORT_AND = (a, b) -> (short) (a & b);
    public static final ShortBinaryOperator SHORT_OR  = (a, b) -> (short) (a | b);
    public static final ShortBinaryOperator SHORT_XOR = (a, b) -> (short) (a ^ b);
    public static final ShortUnaryOperator  SHORT_NEG = a -> (short) -a;
    public static final ShortUnaryOperator  SHORT_NOT = a -> (short) ~a;

    /* Range array */

    public static short[] range(short end) {
        return range((short) 0, end);
    }

    public static short[] range(short start, short end) {
        short[] array = new short[(int) Math.abs(end - start)];
        for (int i = 0, step = start <= end ? 1 : -1; i < array.length; i++, start += step) {
            array[i] = start;
        }
        return array;
    }

    /* Array search */

    public static int indexOf(short[] values, ShortPredicate check) {
        return indexOf(values, check, 0, values.length, -1);
    }

    public static int indexOf(short[] values, ShortPredicate check, int from, int to, int def) {
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

    public static byte[] coerceToByteArray(short[] values) {
        byte[] bytes = new byte[values.length];
        for (int i = 0; i < values.length; i++) {
            bytes[i] = (byte) values[i];
        }
        return bytes;
    }

    public static int[] coerceToIntArray(short[] values) {
        int[] ints = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            ints[i] = (int) values[i];
        }
        return ints;
    }

    public static long[] coerceToLongArray(short[] values) {
        long[] longs = new long[values.length];
        for (int i = 0; i < values.length; i++) {
            longs[i] = (long) values[i];
        }
        return longs;
    }

    public static double[] coerceToDoubleArray(short[] values) {
        double[] doubles = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            doubles[i] = (double) values[i];
        }
        return doubles;
    }

    /* Array bit-level conversions */

    public static final int BYTES = Short.BYTES;

    public static byte[] toBigEndianBytes(short[] array) {
        java.nio.ByteBuffer byteBuffer = java.nio.ByteBuffer.allocate(array.length * Short.BYTES);
        byteBuffer.asShortBuffer().put(array);
        return byteBuffer.array();
    }

    public static short[] fromBigEndianBytes(byte[] bytes) {
        assert bytes.length % BYTES == 0 : "Size mismatch on conversion to short[]: " + bytes.length;
        short[] array = new short[bytes.length / BYTES];
        for (int i = 0, j = 0; i < array.length; i++, j += BYTES) {
            array[i] = valueOfBigEndianBytes(bytes, j);
        }
        return array;
    }

    public static short valueOfBigEndianBytes(byte[] bytes) {
        return valueOfBigEndianBytes(bytes, 0);
    }

    public static byte[] toBigEndianBytes(short value) {
        return new byte[] {(byte) (value >> 8), (byte) value};
    }

    public static short valueOfBigEndianBytes(byte[] bytes, int start) {
        assert start + BYTES <= bytes.length : "Array too small: %s < %s".formatted(bytes.length, start + BYTES);
        return valueOfBigEndianBytes(bytes[start], bytes[start + 1]);
    }

    public static short valueOfBigEndianBytes(byte b1, byte b2) {
        return (short) ((b1 << 8) | (b2 & 0xFF));
    }

    /* Java NIO buffers */

    // https://stackoverflow.com/questions/679298/gets-byte-array-from-a-bytebuffer-in-java
    private static short[] remainingShorts(java.nio.ShortBuffer buffer) {
        short[] shorts = new short[buffer.remaining()];
        buffer.get(shorts, 0, shorts.length);
        return shorts;
    }

    /* Positive/non-negative number selections */

    public static short firstPositive(short a, short b) {
        if (a > 0) return a;
        if (b > 0) return b;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d".formatted(a, b));
    }

    public static short firstPositive(short a, short b, short c) {
        if (a > 0) return a;
        if (b > 0) return b;
        if (c > 0) return c;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d, %d".formatted(a, b, c));
    }

    public static short firstPositive(short ... nums) {
        for (short num : nums) {
            if (num > 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are non-positive: " + Arrays.toString(nums));
    }

    public static short firstNonNegative(short a, short b) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        throw new IllegalArgumentException("All numbers are negative: %d, %d".formatted(a, b));
    }

    public static short firstNonNegative(short a, short b, short c) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        if (c >= 0) return c;
        throw new IllegalArgumentException("All numbers are negative: %d, %d, %d".formatted(a, b, c));
    }

    public static short firstNonNegative(short ... nums) {
        for (short num : nums) {
            if (num >= 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are negative: " + Arrays.toString(nums));
    }

    /* Positive/non-negative assersions */

    public static short requirePositive(short val) {
        if (val <= 0)
            throw new IllegalArgumentException("Value must be positive: " + val);
        return val;
    }

    public static short requireNonNegative(short val) {
        if (val < 0)
            throw new IllegalArgumentException("Value must be non-negative: " + val);
        return val;
    }
}
