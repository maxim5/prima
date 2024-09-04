package io.spbx.util.prima.ops;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import io.spbx.util.prima.func.IntUnaryOperator;

/**
 * Utility operations for <code>int</code>s.
 */
@Generated(value = "$Type$Ops.java", date = "2024-09-04T12:43:13.906454100Z")
public class IntOps {
    public static final IntBinaryOperator INT_ADD = Integer::sum;
    public static final IntBinaryOperator INT_MUL = (a, b) -> a * b;
    public static final IntBinaryOperator INT_AND = (a, b) -> a & b;
    public static final IntBinaryOperator INT_OR  = (a, b) -> a | b;
    public static final IntBinaryOperator INT_XOR = (a, b) -> a ^ b;
    public static final IntUnaryOperator  INT_NEG = a -> -a;
    public static final IntUnaryOperator  INT_NOT = a -> ~a;
    public static final IntUnaryOperator INT_TO_ASCII_LOWER = IntOps::toAsciiLowerCase;
    public static final IntUnaryOperator INT_TO_ASCII_UPPER = IntOps::toAsciiUpperCase;
    public static final IntPredicate INT_IS_ASCII_LOWER_LETTER = IntOps::isAsciiLowerCase;
    public static final IntPredicate INT_IS_ASCII_UPPER_LETTER = IntOps::isAsciiUpperCase;

    public static boolean isAsciiLowerCase(int val) {
        return 'a' <= val && val <= 'z';
    }

    public static boolean isAsciiUpperCase(int val) {
        return 'A' <= val && val <= 'Z';
    }

    public static int toAsciiLowerCase(int val) {
        return isAsciiUpperCase(val) ? (int) (val + 32) : val;  // 32 = 'a' - 'A'
    }

    public static int toAsciiUpperCase(int val) {
        return isAsciiLowerCase(val) ? (int) (val - 32) : val;  // 32 = 'a' - 'A'
    }

    /* Range array */

    public static int[] range(int end) {
        return range((int) 0, end);
    }

    public static int[] range(int start, int end) {
        int[] array = new int[(int) Math.abs(end - start)];
        for (int i = 0, step = start <= end ? 1 : -1; i < array.length; i++, start += step) {
            array[i] = start;
        }
        return array;
    }

    /* Array search */

    public static int indexOf(int[] values, IntPredicate check) {
        return indexOf(values, check, 0, values.length, -1);
    }

    public static int indexOf(int[] values, IntPredicate check, int from, int to, int def) {
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

    public static byte[] coerceToByteArray(int[] values) {
        byte[] bytes = new byte[values.length];
        for (int i = 0; i < values.length; i++) {
            bytes[i] = (byte) values[i];
        }
        return bytes;
    }

    public static long[] coerceToLongArray(int[] values) {
        long[] longs = new long[values.length];
        for (int i = 0; i < values.length; i++) {
            longs[i] = (long) values[i];
        }
        return longs;
    }

    public static char[] coerceToCharArray(int[] values) {
        char[] chars = new char[values.length];
        for (int i = 0; i < values.length; i++) {
            chars[i] = (char) values[i];
        }
        return chars;
    }

    public static double[] coerceToDoubleArray(int[] values) {
        double[] doubles = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            doubles[i] = (double) values[i];
        }
        return doubles;
    }

    /* Array bit-level conversions */

    public static final int BYTES = Integer.BYTES;

    public static byte[] toBigEndianBytes(int[] array) {
        java.nio.ByteBuffer byteBuffer = java.nio.ByteBuffer.allocate(array.length * Integer.BYTES);
        byteBuffer.asIntBuffer().put(array);
        return byteBuffer.array();
    }

    public static int[] fromBigEndianBytes(byte[] bytes) {
        assert bytes.length % BYTES == 0 : "Size mismatch on conversion to int[]: " + bytes.length;
        int[] array = new int[bytes.length / BYTES];
        for (int i = 0, j = 0; i < array.length; i++, j += BYTES) {
            array[i] = valueOfBigEndianBytes(bytes, j);
        }
        return array;
    }

    public static int valueOfBigEndianBytes(byte[] bytes) {
        return valueOfBigEndianBytes(bytes, 0);
    }

    public static byte[] toBigEndianBytes(int value) {
        return new byte[] {
            (byte) (value >> 24), (byte) (value >> 16), (byte) (value >> 8), (byte) value
        };
    }

    public static int valueOfBigEndianBytes(byte[] bytes, int start) {
        assert start + BYTES <= bytes.length : "Array too small: %s < %s".formatted(bytes.length, start + BYTES);
        return valueOfBigEndianBytes(bytes[start], bytes[start + 1], bytes[start + 2], bytes[start + 3]);
    }

    public static int valueOfBigEndianBytes(byte b1, byte b2, byte b3, byte b4) {
        return b1 << 24 | (b2 & 0xFF) << 16 | (b3 & 0xFF) << 8 | (b4 & 0xFF);
    }

    /* Java NIO buffers */

    // https://stackoverflow.com/questions/679298/gets-byte-array-from-a-bytebuffer-in-java
    private static int[] remainingInts(java.nio.IntBuffer buffer) {
        int[] ints = new int[buffer.remaining()];
        buffer.get(ints, 0, ints.length);
        return ints;
    }

    /* Positive/non-negative number selections */

    public static int firstPositive(int a, int b) {
        if (a > 0) return a;
        if (b > 0) return b;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d".formatted(a, b));
    }

    public static int firstPositive(int a, int b, int c) {
        if (a > 0) return a;
        if (b > 0) return b;
        if (c > 0) return c;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d, %d".formatted(a, b, c));
    }

    public static int firstPositive(int ... nums) {
        for (int num : nums) {
            if (num > 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are non-positive: " + Arrays.toString(nums));
    }

    public static int firstNonNegative(int a, int b) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        throw new IllegalArgumentException("All numbers are negative: %d, %d".formatted(a, b));
    }

    public static int firstNonNegative(int a, int b, int c) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        if (c >= 0) return c;
        throw new IllegalArgumentException("All numbers are negative: %d, %d, %d".formatted(a, b, c));
    }

    public static int firstNonNegative(int ... nums) {
        for (int num : nums) {
            if (num >= 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are negative: " + Arrays.toString(nums));
    }

    /* Positive/non-negative assersions */

    public static int requirePositive(int val) {
        if (val <= 0)
            throw new IllegalArgumentException("Value must be positive: " + val);
        return val;
    }

    public static int requireNonNegative(int val) {
        if (val < 0)
            throw new IllegalArgumentException("Value must be non-negative: " + val);
        return val;
    }
}
