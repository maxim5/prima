package io.spbx.util.prima.extern.hppc;

import org.jetbrains.annotations.NotNull;

import com.carrotsearch.hppc.DoubleArrayList;
import com.carrotsearch.hppc.DoubleContainer;
import com.carrotsearch.hppc.DoubleLookupContainer;
import com.carrotsearch.hppc.cursors.DoubleCursor;
import com.carrotsearch.hppc.predicates.DoublePredicate;
import com.carrotsearch.hppc.procedures.DoubleDoubleProcedure;
import com.carrotsearch.hppc.procedures.DoubleObjectProcedure;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Helper utils for Hppc double classes:
 * {@link DoubleContainer}, {@link DoubleArrayList}, {@link DoubleHashSet}, etc.
 *
 * @link <a href='https://github.com/carrotsearch/hppc'>Hppc GitHub</a>
 */
@Generated(value = "Hppc$Type$.java", date = "2024-09-20T09:36:23.324475945Z")
public class HppcDouble {
    /*
     * In case Hppc library is not in a classpath, try to fail early and produce a friendly error message.
     */
    static {
        PrimaRuntimeRequirement.verify("com.carrotsearch.hppc.DoubleArrayList");
    }

    /* `DoubleList` manipulations */

    public static @NotNull DoubleArrayList slice(@NotNull DoubleArrayList list, int fromIndex, int toIndex) {
        assert fromIndex >= 0 && toIndex >= 0 && fromIndex <= toIndex :
            "Invalid range: from=%d to=%d".formatted(fromIndex, toIndex);
        fromIndex = Math.min(fromIndex, list.elementsCount);
        toIndex = Math.min(toIndex, list.elementsCount);
        DoubleArrayList slice = new DoubleArrayList();
        slice.buffer = Arrays.copyOfRange(list.buffer, fromIndex, toIndex);
        slice.elementsCount = toIndex - fromIndex;
        return slice;
    }

    public static void iterateChunks(@NotNull DoubleContainer container,
                                     int chunkSize,
                                     @NotNull Consumer<DoubleArrayList> consumer) {
        assert chunkSize > 0 : "Invalid chunk size: " + chunkSize;
        DoubleArrayList arrayList = toDoubleArrayList(container);
        for (int i = 0; i < arrayList.size(); i += chunkSize) {
            DoubleArrayList chunk = HppcDouble.slice(arrayList, i, i + chunkSize);
            consumer.accept(chunk);
        }
    }

    public static @NotNull DoubleArrayList toDoubleArrayList(@NotNull DoubleContainer container) {
        return container instanceof DoubleArrayList arrayList ? arrayList : new DoubleArrayList(container);
    }

    /* Java `List` <-> `DoubleList` conversions */

    public static @NotNull DoubleArrayList toDoubleList(@NotNull Iterable<Double> list) {
        DoubleArrayList arrayList = new DoubleArrayList();
        list.forEach(arrayList::add);
        return arrayList;
    }

    public static @NotNull Stream<DoubleCursor> toJavaStream(@NotNull DoubleContainer container) {
        return StreamSupport.stream(container.spliterator(), false);
    }

    public static @NotNull ArrayList<Double> toJavaList(@NotNull DoubleContainer container) {
        ArrayList<Double> list = new ArrayList<>(container.size());
        for (DoubleCursor cursor : container) {
            list.add(cursor.value);
        }
        return list;
    }
}
