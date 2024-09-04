package io.spbx.util.prima.ops;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import io.spbx.util.prima.func.LongUnaryOperator;

/**
 * Utility operations for <code>long</code>s.
 */
@Generated(value = "$Type$Ops.java", date = "2024-09-04T12:43:13.906454100Z")
public class LongOps {
    public static final LongBinaryOperator LONG_ADD = Long::sum;
    public static final LongBinaryOperator LONG_MUL = (a, b) -> a * b;
    public static final LongBinaryOperator LONG_AND = (a, b) -> a & b;
    public static final LongBinaryOperator LONG_OR  = (a, b) -> a | b;
    public static final LongBinaryOperator LONG_XOR = (a, b) -> a ^ b;
    public static final LongUnaryOperator  LONG_NEG = a -> -a;
    public static final LongUnaryOperator  LONG_NOT = a -> ~a;

    /* Range array */

    public static long[] range(long end) {
        return range((long) 0, end);
    }

    public static long[] range(long start, long end) {
        long[] array = new long[(int) Math.abs(end - start)];
        for (int i = 0, step = start <= end ? 1 : -1; i < array.length; i++, start += step) {
            array[i] = start;
        }
        return array;
    }

    /* Array search */

    public static int indexOf(long[] values, LongPredicate check) {
        return indexOf(values, check, 0, values.length, -1);
    }

    public static int indexOf(long[] values, LongPredicate check, int from, int to, int def) {
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

    public static byte[] coerceToByteArray(long[] values) {
        byte[] bytes = new byte[values.length];
        for (int i = 0; i < values.length; i++) {
            bytes[i] = (byte) values[i];
        }
        return bytes;
    }

    public static int[] coerceToIntArray(long[] values) {
        int[] ints = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            ints[i] = (int) values[i];
        }
        return ints;
    }

    public static double[] coerceToDoubleArray(long[] values) {
        double[] doubles = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            doubles[i] = (double) values[i];
        }
        return doubles;
    }

    /* Array bit-level conversions */

    public static final int BYTES = Long.BYTES;

    public static byte[] toBigEndianBytes(long[] array) {
        java.nio.ByteBuffer byteBuffer = java.nio.ByteBuffer.allocate(array.length * Long.BYTES);
        byteBuffer.asLongBuffer().put(array);
        return byteBuffer.array();
    }

    public static long[] fromBigEndianBytes(byte[] bytes) {
        assert bytes.length % BYTES == 0 : "Size mismatch on conversion to long[]: " + bytes.length;
        long[] array = new long[bytes.length / BYTES];
        for (int i = 0, j = 0; i < array.length; i++, j += BYTES) {
            array[i] = valueOfBigEndianBytes(bytes, j);
        }
        return array;
    }

    public static long valueOfBigEndianBytes(byte[] bytes) {
        return valueOfBigEndianBytes(bytes, 0);
    }

    public static byte[] toBigEndianBytes(long value) {
        byte[] result = new byte[8];
        for (int i = 7; i >= 0; i--) {
            result[i] = (byte) (value & 0xffL);
            value >>= 8;
        }
        return result;
    }

    public static long valueOfBigEndianBytes(byte[] bytes, int start) {
        assert start + BYTES <= bytes.length : "Array too small: %s < %s".formatted(bytes.length, start + BYTES);
        return valueOfBigEndianBytes(bytes[start], bytes[start + 1], bytes[start + 2], bytes[start + 3],
                                     bytes[start + 4], bytes[start + 5], bytes[start + 6], bytes[start + 7]);
    }

    public static long valueOfBigEndianBytes(byte b1, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return (b1 & 0xFFL) << 56
               | (b2 & 0xFFL) << 48
               | (b3 & 0xFFL) << 40
               | (b4 & 0xFFL) << 32
               | (b5 & 0xFFL) << 24
               | (b6 & 0xFFL) << 16
               | (b7 & 0xFFL) << 8
               | (b8 & 0xFFL);
    }

    /* Java NIO buffers */

    // https://stackoverflow.com/questions/679298/gets-byte-array-from-a-bytebuffer-in-java
    private static long[] remainingLongs(java.nio.LongBuffer buffer) {
        long[] longs = new long[buffer.remaining()];
        buffer.get(longs, 0, longs.length);
        return longs;
    }

    /* Positive/non-negative number selections */

    public static long firstPositive(long a, long b) {
        if (a > 0) return a;
        if (b > 0) return b;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d".formatted(a, b));
    }

    public static long firstPositive(long a, long b, long c) {
        if (a > 0) return a;
        if (b > 0) return b;
        if (c > 0) return c;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d, %d".formatted(a, b, c));
    }

    public static long firstPositive(long ... nums) {
        for (long num : nums) {
            if (num > 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are non-positive: " + Arrays.toString(nums));
    }

    public static long firstNonNegative(long a, long b) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        throw new IllegalArgumentException("All numbers are negative: %d, %d".formatted(a, b));
    }

    public static long firstNonNegative(long a, long b, long c) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        if (c >= 0) return c;
        throw new IllegalArgumentException("All numbers are negative: %d, %d, %d".formatted(a, b, c));
    }

    public static long firstNonNegative(long ... nums) {
        for (long num : nums) {
            if (num >= 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are negative: " + Arrays.toString(nums));
    }

    /* Positive/non-negative assersions */

    public static long requirePositive(long val) {
        if (val <= 0)
            throw new IllegalArgumentException("Value must be positive: " + val);
        return val;
    }

    public static long requireNonNegative(long val) {
        if (val < 0)
            throw new IllegalArgumentException("Value must be non-negative: " + val);
        return val;
    }
}
