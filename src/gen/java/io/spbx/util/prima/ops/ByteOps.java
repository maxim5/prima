package io.spbx.util.prima.ops;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import io.spbx.util.prima.func.BytePredicate;
import io.spbx.util.prima.func.ByteBinaryOperator;
import io.spbx.util.prima.func.ByteUnaryOperator;

/**
 * Utility operations for <code>byte</code>s.
 */
@Generated(value = "$Type$Ops.java", date = "2024-09-04T12:43:13.906454100Z")
public class ByteOps {
    public static final ByteBinaryOperator BYTE_ADD = (a, b) -> (byte) (a + b);
    public static final ByteBinaryOperator BYTE_MUL = (a, b) -> (byte) (a * b);
    public static final ByteBinaryOperator BYTE_AND = (a, b) -> (byte) (a & b);
    public static final ByteBinaryOperator BYTE_OR  = (a, b) -> (byte) (a | b);
    public static final ByteBinaryOperator BYTE_XOR = (a, b) -> (byte) (a ^ b);
    public static final ByteUnaryOperator  BYTE_NEG = a -> (byte) -a;
    public static final ByteUnaryOperator  BYTE_NOT = a -> (byte) ~a;
    public static final ByteUnaryOperator BYTE_TO_ASCII_LOWER = ByteOps::toAsciiLowerCase;
    public static final ByteUnaryOperator BYTE_TO_ASCII_UPPER = ByteOps::toAsciiUpperCase;
    public static final BytePredicate BYTE_IS_ASCII_LOWER_LETTER = ByteOps::isAsciiLowerCase;
    public static final BytePredicate BYTE_IS_ASCII_UPPER_LETTER = ByteOps::isAsciiUpperCase;

    public static boolean isAsciiLowerCase(byte val) {
        return 'a' <= val && val <= 'z';
    }

    public static boolean isAsciiUpperCase(byte val) {
        return 'A' <= val && val <= 'Z';
    }

    public static byte toAsciiLowerCase(byte val) {
        return isAsciiUpperCase(val) ? (byte) (val + 32) : val;  // 32 = 'a' - 'A'
    }

    public static byte toAsciiUpperCase(byte val) {
        return isAsciiLowerCase(val) ? (byte) (val - 32) : val;  // 32 = 'a' - 'A'
    }

    /* Range array */

    public static byte[] range(byte end) {
        return range((byte) 0, end);
    }

    public static byte[] range(byte start, byte end) {
        byte[] array = new byte[(int) Math.abs(end - start)];
        for (int i = 0, step = start <= end ? 1 : -1; i < array.length; i++, start += step) {
            array[i] = start;
        }
        return array;
    }

    /* Array search */

    public static int indexOf(byte[] values, BytePredicate check) {
        return indexOf(values, check, 0, values.length, -1);
    }

    public static int indexOf(byte[] values, BytePredicate check, int from, int to, int def) {
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

    public static int[] coerceToIntArray(byte[] values) {
        int[] ints = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            ints[i] = (int) values[i];
        }
        return ints;
    }

    public static long[] coerceToLongArray(byte[] values) {
        long[] longs = new long[values.length];
        for (int i = 0; i < values.length; i++) {
            longs[i] = (long) values[i];
        }
        return longs;
    }

    public static char[] coerceToCharArray(byte[] values) {
        char[] chars = new char[values.length];
        for (int i = 0; i < values.length; i++) {
            chars[i] = (char) values[i];
        }
        return chars;
    }

    public static double[] coerceToDoubleArray(byte[] values) {
        double[] doubles = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            doubles[i] = (double) values[i];
        }
        return doubles;
    }

    /* Java NIO buffers */

    // https://stackoverflow.com/questions/679298/gets-byte-array-from-a-bytebuffer-in-java
    private static byte[] remainingBytes(java.nio.ByteBuffer buffer) {
        byte[] bytes = new byte[buffer.remaining()];
        buffer.get(bytes, 0, bytes.length);
        return bytes;
    }

    /* Positive/non-negative number selections */

    public static byte firstPositive(byte a, byte b) {
        if (a > 0) return a;
        if (b > 0) return b;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d".formatted(a, b));
    }

    public static byte firstPositive(byte a, byte b, byte c) {
        if (a > 0) return a;
        if (b > 0) return b;
        if (c > 0) return c;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d, %d".formatted(a, b, c));
    }

    public static byte firstPositive(byte ... nums) {
        for (byte num : nums) {
            if (num > 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are non-positive: " + Arrays.toString(nums));
    }

    public static byte firstNonNegative(byte a, byte b) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        throw new IllegalArgumentException("All numbers are negative: %d, %d".formatted(a, b));
    }

    public static byte firstNonNegative(byte a, byte b, byte c) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        if (c >= 0) return c;
        throw new IllegalArgumentException("All numbers are negative: %d, %d, %d".formatted(a, b, c));
    }

    public static byte firstNonNegative(byte ... nums) {
        for (byte num : nums) {
            if (num >= 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are negative: " + Arrays.toString(nums));
    }

    /* Positive/non-negative assersions */

    public static byte requirePositive(byte val) {
        if (val <= 0)
            throw new IllegalArgumentException("Value must be positive: " + val);
        return val;
    }

    public static byte requireNonNegative(byte val) {
        if (val < 0)
            throw new IllegalArgumentException("Value must be non-negative: " + val);
        return val;
    }
}
