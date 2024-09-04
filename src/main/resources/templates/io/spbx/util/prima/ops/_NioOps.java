package io.spbx.util.prima.ops;

/*= assume false =*/

public class _NioOps {


/*= conversions-start =*/
    public static final int BYTES = $TypeWrap$.BYTES;

    public static byte[] toBigEndianBytes($type$[] array) {
        java.nio.ByteBuffer byteBuffer = java.nio.ByteBuffer.allocate(array.length * $TypeWrap$.BYTES);
        byteBuffer.as$Type$Buffer().put(array);
        return byteBuffer.array();
    }

    /*= if ($type$ == int) || ($type$ == long) || ($type$ == short) || ($type$ == char) =*/
    public static $type$[] fromBigEndianBytes(byte[] bytes) {
        assert bytes.length % BYTES == 0 : "Size mismatch on conversion to $type$[]: " + bytes.length;
        $type$[] array = new $type$[bytes.length / BYTES];
        for (int i = 0, j = 0; i < array.length; i++, j += BYTES) {
            array[i] = valueOfBigEndianBytes(bytes, j);
        }
        return array;
    }

    public static $type$ valueOfBigEndianBytes(byte[] bytes) {
        return valueOfBigEndianBytes(bytes, 0);
    }
    /*= end =*/

    /*= if ($type$ == int) =*/
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
    /*= end =*/

    /*= if ($type$ == long) =*/
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
    /*= end =*/

    /*= if ($type$ == short) || ($type$ == char) =*/
    public static byte[] toBigEndianBytes($type$ value) {
        return new byte[] {(byte) (value >> 8), (byte) value};
    }

    public static $type$ valueOfBigEndianBytes(byte[] bytes, int start) {
        assert start + BYTES <= bytes.length : "Array too small: %s < %s".formatted(bytes.length, start + BYTES);
        return valueOfBigEndianBytes(bytes[start], bytes[start + 1]);
    }

    public static $type$ valueOfBigEndianBytes(byte b1, byte b2) {
        return ($type$) ((b1 << 8) | (b2 & 0xFF));
    }
    /*= end =*/
/*= conversions-end =*/


/*= niobuf-start =*/
    // https://stackoverflow.com/questions/679298/gets-byte-array-from-a-bytebuffer-in-java
    private static $type$[] remaining$Type$s(java.nio.$Type$Buffer buffer) {
        $type$[] $type$s = new $type$[buffer.remaining()];
        buffer.get($type$s, 0, $type$s.length);
        return $type$s;
    }
/*= niobuf-end =*/


}
