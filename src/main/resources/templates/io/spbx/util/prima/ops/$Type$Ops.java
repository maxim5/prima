package io.spbx.util.prima.ops;

import javax.annotation.processing.Generated;
import java.util.Arrays;
/*= if ($type$ == int) || ($type$ == long) || ($type$ == double) =*/
import java.util.function.$Type$BinaryOperator;
import java.util.function.$Type$Predicate;
/*= end =*/
/*= if ($type$ != int) && ($type$ != long) && ($type$ != double) =*/
import io.spbx.util.prima.func.$Type$Predicate;
import io.spbx.util.prima.func.$Type$BinaryOperator;
/*= end =*/
import io.spbx.util.prima.func.$Type$UnaryOperator;

/**
 * Utility operations for <code>$type$</code>s.
 */
@Generated(value = "$source_template$", date = "$now$")
public class $Type$Ops {
    /*= if ($type$ == int) || ($type$ == long) || ($type$ == double) || ($type$ == float) =*/
    public static final $Type$BinaryOperator $TYPE$_ADD = $TypeWrap$::sum;
    public static final $Type$BinaryOperator $TYPE$_MUL = (a, b) -> a * b;
    /*= end =*/
    /*= if ($type$ == byte) || ($type$ == short) =*/
    public static final $Type$BinaryOperator $TYPE$_ADD = (a, b) -> ($type$) (a + b);
    public static final $Type$BinaryOperator $TYPE$_MUL = (a, b) -> ($type$) (a * b);
    /*= end =*/
    /*= if ($type$ == int) || ($type$ == long) =*/
    public static final $Type$BinaryOperator $TYPE$_AND = (a, b) -> a & b;
    public static final $Type$BinaryOperator $TYPE$_OR  = (a, b) -> a | b;
    public static final $Type$BinaryOperator $TYPE$_XOR = (a, b) -> a ^ b;
    /*= end =*/
    /*= if ($type$ == byte) || ($type$ == short) =*/
    public static final $Type$BinaryOperator $TYPE$_AND = (a, b) -> ($type$) (a & b);
    public static final $Type$BinaryOperator $TYPE$_OR  = (a, b) -> ($type$) (a | b);
    public static final $Type$BinaryOperator $TYPE$_XOR = (a, b) -> ($type$) (a ^ b);
    /*= end =*/
    /*= if ($type$ == int) || ($type$ == long) =*/
    public static final $Type$UnaryOperator  $TYPE$_NEG = a -> -a;
    public static final $Type$UnaryOperator  $TYPE$_NOT = a -> ~a;
    /*= end =*/
    /*= if ($type$ == byte) || ($type$ == short) =*/
    public static final $Type$UnaryOperator  $TYPE$_NEG = a -> ($type$) -a;
    public static final $Type$UnaryOperator  $TYPE$_NOT = a -> ($type$) ~a;
    /*= end =*/

    /*= if ($type$ == char) =*/
    public static final $Type$UnaryOperator $TYPE$_TO_LOWER = $TypeWrap$::toLowerCase;
    public static final $Type$UnaryOperator $TYPE$_TO_UPPER = $TypeWrap$::toUpperCase;
    /*= end =*/
    /*= if ($type$ == char) || ($type$ == byte) || ($type$ == int) =*/
    public static final $Type$UnaryOperator $TYPE$_TO_ASCII_LOWER = $Type$Ops::toAsciiLowerCase;
    public static final $Type$UnaryOperator $TYPE$_TO_ASCII_UPPER = $Type$Ops::toAsciiUpperCase;
    public static final $Type$Predicate $TYPE$_IS_ASCII_LOWER_LETTER = $Type$Ops::isAsciiLowerCase;
    public static final $Type$Predicate $TYPE$_IS_ASCII_UPPER_LETTER = $Type$Ops::isAsciiUpperCase;

    public static boolean isAsciiLowerCase($type$ val) {
        return 'a' <= val && val <= 'z';
    }

    public static boolean isAsciiUpperCase($type$ val) {
        return 'A' <= val && val <= 'Z';
    }

    public static $type$ toAsciiLowerCase($type$ val) {
        return isAsciiUpperCase(val) ? ($type$) (val + 32) : val;  // 32 = 'a' - 'A'
    }

    public static $type$ toAsciiUpperCase($type$ val) {
        return isAsciiLowerCase(val) ? ($type$) (val - 32) : val;  // 32 = 'a' - 'A'
    }
    /*= end =*/

    /* Range array */

    public static $type$[] range($type$ end) {
        return range(($type$) 0, end);
    }

    public static $type$[] range($type$ start, $type$ end) {
        $type$[] array = new $type$[(int) Math.abs(end - start)];
        for (int i = 0, step = start <= end ? 1 : -1; i < array.length; i++, start += step) {
            array[i] = start;
        }
        return array;
    }

    /* Array search */

    public static int indexOf($type$[] values, $Type$Predicate check) {
        return indexOf(values, check, 0, values.length, -1);
    }

    public static int indexOf($type$[] values, $Type$Predicate check, int from, int to, int def) {
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

    /*= if ($type$ != byte) && ($type$ != double) && ($type$ != float) =*/
    public static byte[] coerceToByteArray($type$[] values) {
        byte[] bytes = new byte[values.length];
        for (int i = 0; i < values.length; i++) {
            bytes[i] = (byte) values[i];
        }
        return bytes;
    }
    /*= end =*/

    /*= if ($type$ != int) =*/
    public static int[] coerceToIntArray($type$[] values) {
        int[] ints = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            ints[i] = (int) values[i];
        }
        return ints;
    }
    /*= end =*/

    /*= if ($type$ != long) =*/
    public static long[] coerceToLongArray($type$[] values) {
        long[] longs = new long[values.length];
        for (int i = 0; i < values.length; i++) {
            longs[i] = (long) values[i];
        }
        return longs;
    }
    /*= end =*/

    /*= if ($type$ == byte) || ($type$ == int) =*/
    public static char[] coerceToCharArray($type$[] values) {
        char[] chars = new char[values.length];
        for (int i = 0; i < values.length; i++) {
            chars[i] = (char) values[i];
        }
        return chars;
    }
    /*= end =*/

    /*= if ($type$ != double) && ($type$ != char) =*/
    public static double[] coerceToDoubleArray($type$[] values) {
        double[] doubles = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            doubles[i] = (double) values[i];
        }
        return doubles;
    }
    /*= end =*/

/*= if ($type$ != byte) =*/
    /* Array bit-level conversions */

    /*= import "io/spbx/util/prima/ops/_NioOps.java" conversions =*/
/*= end =*/

/*= if ($type$ != char) =*/
    /* Positive/non-negative number selections */

    public static $type$ firstPositive($type$ a, $type$ b) {
        if (a > 0) return a;
        if (b > 0) return b;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d".formatted(a, b));
    }

    public static $type$ firstPositive($type$ a, $type$ b, $type$ c) {
        if (a > 0) return a;
        if (b > 0) return b;
        if (c > 0) return c;
        throw new IllegalArgumentException("All numbers are non-positive: %d, %d, %d".formatted(a, b, c));
    }

    public static $type$ firstPositive($type$ ... nums) {
        for ($type$ num : nums) {
            if (num > 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are non-positive: " + Arrays.toString(nums));
    }

    public static $type$ firstNonNegative($type$ a, $type$ b) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        throw new IllegalArgumentException("All numbers are negative: %d, %d".formatted(a, b));
    }

    public static $type$ firstNonNegative($type$ a, $type$ b, $type$ c) {
        if (a >= 0) return a;
        if (b >= 0) return b;
        if (c >= 0) return c;
        throw new IllegalArgumentException("All numbers are negative: %d, %d, %d".formatted(a, b, c));
    }

    public static $type$ firstNonNegative($type$ ... nums) {
        for ($type$ num : nums) {
            if (num >= 0)
                return num;
        }
        throw new IllegalArgumentException("All numbers are negative: " + Arrays.toString(nums));
    }

    /* Positive/non-negative assersions */

    public static $type$ requirePositive($type$ val) {
        if (val <= 0)
            throw new IllegalArgumentException("Value must be positive: " + val);
        return val;
    }

    public static $type$ requireNonNegative($type$ val) {
        if (val < 0)
            throw new IllegalArgumentException("Value must be non-negative: " + val);
        return val;
    }
/*= end =*/
}
