package io.spbx.util.prima.ops;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import io.spbx.util.prima.func.FloatPredicate;
import io.spbx.util.prima.func.FloatBinaryOperator;
import io.spbx.util.prima.func.FloatUnaryOperator;

/**
 * Utility operations for <code>float</code>s.
 */
@Generated(value = "$Type$Ops.java", date = "2024-09-04T12:43:13.906454100Z")
public class FloatOps {
    public static final FloatBinaryOperator FLOAT_ADD = Float::sum;
    public static final FloatBinaryOperator FLOAT_MUL = (a, b) -> a * b;

    /* Range array */

    public static float[] range(float end) {
        return range((float) 0, end);
    }

    public static float[] range(float start, float end) {
        float[] array = new float[(int) Math.abs(end - start)];
        for (int i = 0, step = start <= end ? 1 : -1; i < array.length; i++, start += step) {
            array[i] = start;
        }
        return array;
    }

    /* Array search */

    public static int indexOf(float[] values, FloatPredicate check) {
        return indexOf(values, check, 0, values.length, -1);
    }

    public static int indexOf(float[] values, FloatPredicate check, int from, int to, int def) {
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

    public static int[] coerceToIntArray(float[] values) {
        int[] ints = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            ints[i] = (int) values[i];
        }
        return ints;
    }

    public static long[] coerceToLongArray(float[] values) {
        long[] longs = new long[values.length];
        for (int i = 0; i < values.length; i++) {
            longs[i] = (long) values[i];
        }
        return longs;
    }

    public static double[] coerceToDoubleArray(float[] values) {
        double[] doubles = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            doubles[i] = (double) values[i];
        }
        return doubles;
    }

    /* Array bit-level conversions */

    public static final int BYTES = Float.BYTES;

    public static byte[] toBigEndianBytes(float[] array) {
        java.nio.ByteBuffer byteBuffer = java.nio.ByteBuffer.allocate(array.length * Float.BYTES);
        byteBuffer.asFloatBuffer().put(array);
        return byteBuffer.array();
    }

    /* Java NIO buffers */

    // https://stackoverflow.com/questions/679298/gets-byte-array-from-a-bytebuffer-in-java
    private static float[] remainingFloats(java.nio.FloatBuffer buffer) {
        float[] floats = new float[buffer.remaining()];
        buffer.get(floats, 0, floats.length);
        return floats;
    }

    /* Positive/non-negative number selections */

    public static float firstPositive(float a, float b) {
        if (a > 0) return a;
        if (b > 0) return b;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d".formatted(a, b));
    }

    public static float firstPositive(float a, float b, float c) {
        if (a > 0) return a;
        if (b > 0) return b;
        if (c > 0) return c;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d, %d".formatted(a, b, c));
    }

    public static float firstPositive(float ... nums) {
        for (float num : nums) {
            if (num > 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are non-positive: " + Arrays.toString(nums));
    }

    public static float firstNonNegative(float a, float b) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        throw new IllegalArgumentException("All numbers are negative: %d, %d".formatted(a, b));
    }

    public static float firstNonNegative(float a, float b, float c) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        if (c >= 0) return c;
        throw new IllegalArgumentException("All numbers are negative: %d, %d, %d".formatted(a, b, c));
    }

    public static float firstNonNegative(float ... nums) {
        for (float num : nums) {
            if (num >= 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are negative: " + Arrays.toString(nums));
    }

    /* Positive/non-negative assersions */

    public static float requirePositive(float val) {
        if (val <= 0)
            throw new IllegalArgumentException("Value must be positive: " + val);
        return val;
    }

    public static float requireNonNegative(float val) {
        if (val < 0)
            throw new IllegalArgumentException("Value must be non-negative: " + val);
        return val;
    }
}
