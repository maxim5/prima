package io.spbx.util.prima.testing;

import com.carrotsearch.hppc.ByteArrayList;
import com.carrotsearch.hppc.ByteContainer;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.IntContainer;
import com.carrotsearch.hppc.IntHashSet;
import com.carrotsearch.hppc.IntIntMap;
import com.carrotsearch.hppc.IntObjectMap;
import com.carrotsearch.hppc.LongArrayList;
import com.carrotsearch.hppc.LongContainer;
import com.carrotsearch.hppc.LongHashSet;
import com.carrotsearch.hppc.LongLongMap;
import com.carrotsearch.hppc.LongObjectMap;
import com.google.common.truth.MapSubject;
import com.google.common.truth.Truth;
import com.google.errorprone.annotations.CheckReturnValue;
import io.spbx.util.prima.extern.hppc.HppcInt;
import io.spbx.util.prima.extern.hppc.HppcLong;
import io.spbx.util.prima.ops.IntOps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

import static io.spbx.util.prima.testing.TestingHppc.*;

public class AssertHppc {
    @CheckReturnValue
    public static @NotNull IntContainerSubject assertArray(@NotNull IntContainer container) {
        return new IntContainerSubject(container);
    }

    @CheckReturnValue
    public static @NotNull IntContainerSubject assertArray(int @NotNull[] ints) {
        return assertArray(IntArrayList.from(ints));
    }

    @CheckReturnValue
    public static @NotNull LongContainerSubject assertArray(@NotNull LongContainer container) {
        return new LongContainerSubject(container);
    }

    @CheckReturnValue
    public static @NotNull LongContainerSubject assertArray(long @NotNull[] longs) {
        return assertArray(LongArrayList.from(longs));
    }

    @CheckReturnValue
    public static @NotNull ByteContainerSubject assertArray(@NotNull ByteContainer container) {
        return new ByteContainerSubject(container);
    }

    @CheckReturnValue
    public static @NotNull ByteContainerSubject assertArray(byte @NotNull[] bytes) {
        return assertArray(ByteArrayList.from(bytes));
    }

    @CheckReturnValue
    public static @NotNull IntIntMapSubject assertMap(@NotNull IntIntMap map) {
        return new IntIntMapSubject(map);
    }

    @CheckReturnValue
    public static <T> @NotNull IntObjectMapSubject<T> assertMap(@NotNull IntObjectMap<T> map) {
        return new IntObjectMapSubject<>(map);
    }

    @CheckReturnValue
    public static @NotNull LongLongMapSubject assertMap(@NotNull LongLongMap map) {
        return new LongLongMapSubject(map);
    }

    @CheckReturnValue
    public static <T> @NotNull LongObjectMapSubject<T> assertMap(@NotNull LongObjectMap<T> map) {
        return new LongObjectMapSubject<>(map);
    }

    public record IntContainerSubject(@NotNull IntContainer container) {
        public void isEmpty() {
            Truth.assertThat(container).isEmpty();
        }

        public void containsExactlyInOrder(int... expected) {
            Truth.assertThat(new IntArrayList(container)).isEqualTo(IntArrayList.from(expected));
        }

        public void containsExactlyNoOrder(int... expected) {
            Truth.assertThat(new IntHashSet(container)).isEqualTo(IntHashSet.from(expected));
        }
    }

    public record LongContainerSubject(@NotNull LongContainer container) {
        public void isEmpty() {
            Truth.assertThat(container).isEmpty();
        }

        public void containsExactlyInOrder(long... expected) {
            Truth.assertThat(new LongArrayList(container)).isEqualTo(LongArrayList.from(expected));
        }

        public void containsExactlyNoOrder(long... expected) {
            Truth.assertThat(new LongHashSet(container)).isEqualTo(LongHashSet.from(expected));
        }
    }

    public record ByteContainerSubject(@NotNull ByteContainer container) {
        public void isEmpty() {
            Truth.assertThat(container).isEmpty();
        }

        public void containsExactlyInOrder(int... expected) {
            Truth.assertThat(new ByteArrayList(container)).isEqualTo(from(expected));
        }

        public void containsExactlyNoOrder(int... expected) {
            Truth.assertThat(new ByteArrayList(container).sort()).isEqualTo(from(expected).sort());
        }

        // Primitive-candidate
        private static ByteArrayList from(int[] values) {
            return ByteArrayList.from(IntOps.coerceToByteArray(values));
        }
    }

    public record IntIntMapSubject(@NotNull IntIntMap map) {
        public void isEmpty() {
            Truth.assertThat(map).isEmpty();
        }

        public void isEqualTo(@NotNull IntIntMap expected) {
            Truth.assertThat(map).isEqualTo(expected);
        }

        public void isEqualTo(@NotNull Map<Integer, Integer> expected) {
            asJavaMap().isEqualTo(expected);
        }

        public void containsExactly(int key, int value) {
            Truth.assertThat(map).isEqualTo(newIntMap(key, value));
        }

        public void containsExactly(int key1, int value1, int key2, int value2) {
            Truth.assertThat(map).isEqualTo(newIntMap(key1, value1, key2, value2));
        }

        public void containsExactly(int... expectedKeysValues) {
            Truth.assertThat(map).isEqualTo(newIntMap(expectedKeysValues));
        }

        public void containsExactlyTrimmed(int... expectedKeysValues) {
            isEqualTo(trim(newIntMap(expectedKeysValues)));
        }

        @CheckReturnValue
        public @NotNull IntIntMapSubject trimmed() {
            return new IntIntMapSubject(trim(map));
        }

        @CheckReturnValue
        public @NotNull MapSubject asJavaMap() {
            return Truth.assertThat(HppcInt.toJavaMap(map));
        }
    }

    public record IntObjectMapSubject<T>(@NotNull IntObjectMap<T> map) {
        public void isEmpty() {
            Truth.assertThat(map).isEmpty();
        }

        public void isEqualTo(@NotNull IntObjectMap<T> expected) {
            Truth.assertThat(map).isEqualTo(expected);
        }

        public void isEqualTo(@NotNull Map<Integer, T> expected) {
            asJavaMap().isEqualTo(expected);
        }

        public void containsExactly(int key, @Nullable T expectedValue) {
            isEqualTo(newIntObjectMap(key, expectedValue));
        }

        public void containsExactly(int key1, @Nullable T expectedValue1, int key2, @Nullable T expectedValue2) {
            isEqualTo(newIntObjectMap(key1, expectedValue1, key2, expectedValue2));
        }

        public void containsExactly(@Nullable Object @NotNull ... expectedKeysValues) {
            isEqualTo(newIntObjectMap(expectedKeysValues));
        }

        @CheckReturnValue
        public @NotNull MapSubject asJavaMap() {
            return Truth.assertThat(HppcInt.toJavaMap(map));
        }
    }

    public record LongLongMapSubject(@NotNull LongLongMap map) {
        public void isEmpty() {
            Truth.assertThat(map).isEmpty();
        }

        public void isEqualTo(@NotNull LongLongMap expected) {
            Truth.assertThat(map).isEqualTo(expected);
        }

        public void isEqualTo(@NotNull Map<Integer, Integer> expected) {
            asJavaMap().isEqualTo(expected);
        }

        public void containsExactly(long key, long value) {
            Truth.assertThat(map).isEqualTo(newLongMap(key, value));
        }

        public void containsExactly(long key1, long value1, long key2, long value2) {
            Truth.assertThat(map).isEqualTo(newLongMap(key1, value1, key2, value2));
        }

        public void containsExactly(long... expectedKeysValues) {
            Truth.assertThat(map).isEqualTo(newLongMap(expectedKeysValues));
        }

        public void containsExactlyTrimmed(long... expectedKeysValues) {
            isEqualTo(trim(newLongMap(expectedKeysValues)));
        }

        @CheckReturnValue
        public @NotNull LongLongMapSubject trimmed() {
            return new LongLongMapSubject(trim(map));
        }

        @CheckReturnValue
        public @NotNull MapSubject asJavaMap() {
            return Truth.assertThat(HppcLong.toJavaMap(map));
        }
    }

    public record LongObjectMapSubject<T>(@NotNull LongObjectMap<T> map) {
        public void isEmpty() {
            Truth.assertThat(map).isEmpty();
        }

        public void isEqualTo(@NotNull LongObjectMap<T> expected) {
            Truth.assertThat(map).isEqualTo(expected);
        }

        public void isEqualTo(@NotNull Map<Long, T> expected) {
            asJavaMap().isEqualTo(expected);
        }

        public void containsExactly(long key, @Nullable T expectedValue) {
            isEqualTo(newLongObjectMap(key, expectedValue));
        }

        public void containsExactly(long key1, @Nullable T expectedValue1, long key2, @Nullable T expectedValue2) {
            isEqualTo(newLongObjectMap(key1, expectedValue1, key2, expectedValue2));
        }

        public void containsExactly(@Nullable Object @NotNull ... expectedKeysValues) {
            isEqualTo(newLongObjectMap(expectedKeysValues));
        }

        @CheckReturnValue
        public @NotNull MapSubject asJavaMap() {
            return Truth.assertThat(HppcLong.toJavaMap(map));
        }
    }
}
