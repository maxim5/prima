package io.spbx.util.prima.ops;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoublePredicate;

/**
 * Utility operations for <code>double</code>s.
 */
@Generated(value = "$Type$Ops.java", date = "2024-08-25T16:01:41.995046300Z")
public class DoubleOps {
    public static final DoubleBinaryOperator DOUBLE_ADD = Double::sum;
    public static final DoubleBinaryOperator DOUBLE_MUL = (a, b) -> a * b;

    /* Range array */

    public static double[] range(double end) {
        return range((double) 0, end);
    }

    public static double[] range(double start, double end) {
        double[] array = new double[(int) Math.abs(end - start)];
        for (int i = 0, step = start <= end ? 1 : -1; i < array.length; i++, start += step) {
            array[i] = start;
        }
        return array;
    }

    /* Array search */

    public static int indexOf(double[] values, DoublePredicate check) {
        return indexOf(values, check, 0, values.length, -1);
    }

    public static int indexOf(double[] values, DoublePredicate check, int from, int to, int def) {
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

    public static int[] coerceToIntArray(double[] values) {
        int[] ints = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            ints[i] = (int) values[i];
        }
        return ints;
    }

    public static long[] coerceToLongArray(double[] values) {
        long[] longs = new long[values.length];
        for (int i = 0; i < values.length; i++) {
            longs[i] = (long) values[i];
        }
        return longs;
    }

    /* Array bit-level conversions */

    public static final int BYTES = Double.BYTES;

    public static byte[] toBigEndianBytes(double[] array) {
        java.nio.ByteBuffer byteBuffer = java.nio.ByteBuffer.allocate(array.length * Double.BYTES);
        byteBuffer.asDoubleBuffer().put(array);
        return byteBuffer.array();
    }

    /* Positive/non-negative number selections */

    public static double firstPositive(double a, double b) {
        if (a > 0) return a;
        if (b > 0) return b;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d".formatted(a, b));
    }

    public static double firstPositive(double a, double b, double c) {
        if (a > 0) return a;
        if (b > 0) return b;
        if (c > 0) return c;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d, %d".formatted(a, b, c));
    }

    public static double firstPositive(double ... nums) {
        for (double num : nums) {
            if (num > 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are non-positive: " + Arrays.toString(nums));
    }

    public static double firstNonNegative(double a, double b) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        throw new IllegalArgumentException("All numbers are negative: %d, %d".formatted(a, b));
    }

    public static double firstNonNegative(double a, double b, double c) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        if (c >= 0) return c;
        throw new IllegalArgumentException("All numbers are negative: %d, %d, %d".formatted(a, b, c));
    }

    public static double firstNonNegative(double ... nums) {
        for (double num : nums) {
            if (num >= 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are negative: " + Arrays.toString(nums));
    }

    /* Positive/non-negative assersions */

    public static double requirePositive(double val) {
        if (val <= 0)
            throw new IllegalArgumentException("Value must be positive: " + val);
        return val;
    }

    public static double requireNonNegative(double val) {
        if (val < 0)
            throw new IllegalArgumentException("Value must be non-negative: " + val);
        return val;
    }
}
