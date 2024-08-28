package io.spbx.util.prima.extern.hppc;

import com.carrotsearch.hppc.ByteArrayList;
import org.junit.jupiter.api.Test;

import static io.spbx.util.prima.testing.AssertHppc.assertArray;
import static io.spbx.util.testing.TestingPrimitives.bytes;

public class HppcByteTest {
    @Test
    public void to_array_list() {
        assertArray(HppcByte.toByteArrayList(ByteArrayList.from(bytes(1, 2, 3)))).containsExactlyInOrder(1, 2, 3);
    }
}
