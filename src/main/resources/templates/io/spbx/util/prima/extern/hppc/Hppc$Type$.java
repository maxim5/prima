package io.spbx.util.prima.extern.hppc;

import org.jetbrains.annotations.NotNull;

import com.carrotsearch.hppc.$Type$ArrayList;
import com.carrotsearch.hppc.$Type$Container;
import com.carrotsearch.hppc.$Type$LookupContainer;
/*= if ($type$ == int) || ($type$ == long) || ($type$ == short) =*/
import com.carrotsearch.hppc.$Type$HashSet;
import com.carrotsearch.hppc.$Type$ObjectMap;
import com.carrotsearch.hppc.$Type$$Type$HashMap;
import com.carrotsearch.hppc.$Type$$Type$Map;
/*= end =*/
import com.carrotsearch.hppc.cursors.$Type$Cursor;
import com.carrotsearch.hppc.predicates.$Type$Predicate;
import com.carrotsearch.hppc.procedures.$Type$$Type$Procedure;
import com.carrotsearch.hppc.procedures.$Type$ObjectProcedure;

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
 * Helper utils for Hppc $type$ classes:
 * {@link $Type$Container}, {@link $Type$ArrayList}, {@link $Type$HashSet}, etc.
 *
 * @link <a href='https://github.com/carrotsearch/hppc'>Hppc GitHub</a>
 */
@Generated(value = "$source_template$", date = "$now$")
public class Hppc$Type$ {
    /*
     * In case Hppc library is not in a classpath, try to fail early and produce a friendly error message.
     */
    static {
        PrimaRuntimeRequirement.verify("com.carrotsearch.hppc.$Type$ArrayList");
    }

    /* `$Type$List` manipulations */

    public static @NotNull $Type$ArrayList slice(@NotNull $Type$ArrayList list, int fromIndex, int toIndex) {
        assert fromIndex >= 0 && toIndex >= 0 && fromIndex <= toIndex :
            "Invalid range: from=%d to=%d".formatted(fromIndex, toIndex);
        fromIndex = Math.min(fromIndex, list.elementsCount);
        toIndex = Math.min(toIndex, list.elementsCount);
        $Type$ArrayList slice = new $Type$ArrayList();
        slice.buffer = Arrays.copyOfRange(list.buffer, fromIndex, toIndex);
        slice.elementsCount = toIndex - fromIndex;
        return slice;
    }

    public static void iterateChunks(@NotNull $Type$Container container,
                                     int chunkSize,
                                     @NotNull Consumer<$Type$ArrayList> consumer) {
        assert chunkSize > 0 : "Invalid chunk size: " + chunkSize;
        $Type$ArrayList arrayList = to$Type$ArrayList(container);
        for (int i = 0; i < arrayList.size(); i += chunkSize) {
            $Type$ArrayList chunk = Hppc$Type$.slice(arrayList, i, i + chunkSize);
            consumer.accept(chunk);
        }
    }

    public static @NotNull $Type$ArrayList to$Type$ArrayList(@NotNull $Type$Container container) {
        return container instanceof $Type$ArrayList arrayList ? arrayList : new $Type$ArrayList(container);
    }

    /* Java `List` <-> `$Type$List` conversions */

    public static @NotNull $Type$ArrayList to$Type$List(@NotNull Iterable<$TypeWrap$> list) {
        $Type$ArrayList arrayList = new $Type$ArrayList();
        list.forEach(arrayList::add);
        return arrayList;
    }

    public static @NotNull Stream<$Type$Cursor> toJavaStream(@NotNull $Type$Container container) {
        return StreamSupport.stream(container.spliterator(), false);
    }

    public static @NotNull ArrayList<$TypeWrap$> toJavaList(@NotNull $Type$Container container) {
        ArrayList<$TypeWrap$> list = new ArrayList<>(container.size());
        for ($Type$Cursor cursor : container) {
            list.add(cursor.value);
        }
        return list;
    }

    /*= if ($type$ == int) || ($type$ == long) =*/
    public static @NotNull $Type$ArrayList collectTo$Type$List(@NotNull java.util.stream.$Type$Stream stream) {
        return stream.collect($Type$ArrayList::new, $Type$ArrayList::add, $Type$ArrayList::addAll);
    }
    /*= end =*/

/*= if ($type$ == int) || ($type$ == long) || ($type$ == short) =*/
    /* `$Type$Map` manipulations */

    public static @NotNull $Type$$Type$Map slice(@NotNull $Type$$Type$Map map, $type$ @NotNull[] keys) {
        $Type$$Type$HashMap result = new $Type$$Type$HashMap(keys.length);
        for ($type$ key : keys) {
            result.put(key, map.get(key));
        }
        return result;
    }

    public static @NotNull $Type$$Type$Map slice(@NotNull $Type$$Type$Map map, @NotNull $Type$Container keys) {
        $Type$$Type$HashMap result = new $Type$$Type$HashMap(keys.size());
        for ($Type$Cursor cursor : keys) {
            result.put(cursor.value, map.get(cursor.value));
        }
        return result;
    }

    public static @NotNull Map<$TypeWrap$, $TypeWrap$> toJavaMap(@NotNull $Type$$Type$Map map) {
        HashMap<$TypeWrap$, $TypeWrap$> result = new HashMap<>(map.size());
        map.forEach(($Type$$Type$Procedure) result::put);
        return result;
    }

    public static <T> @NotNull Map<$TypeWrap$, T> toJavaMap(@NotNull $Type$ObjectMap<T> map) {
        HashMap<$TypeWrap$, T> result = new HashMap<>(map.size());
        map.forEach(($Type$ObjectProcedure<T>) result::put);
        return result;
    }

    /*= if ($type$ == int) || ($type$ == long) =*/
    // Note: not pure
    public static $type$ computeIfAbsent(@NotNull $Type$$Type$Map map, $type$ key, @NotNull java.util.function.$Type$Supplier def) {
        $type$ result = map.get(key);
        if (result == 0 && !map.containsKey(key)) {
            result = def.getAs$Type$();
            map.put(key, result);
        }
        return result;
    }
    /*= end =*/

    // Note: not pure
    public static <T> T computeIfAbsent(@NotNull $Type$ObjectMap<T> map, $type$ key, @NotNull Supplier<T> def) {
        T result = map.get(key);
        if (result == null && !map.containsKey(key)) {
            result = def.get();
            map.put(key, result);
        }
        return result;
    }
/*= end =*/

/*= if ($type$ == int) || ($type$ == long) || ($type$ == short) =*/
    /* `$Type$Set` manipulations */

    public static @NotNull $Type$HashSet union(@NotNull $Type$Container lhs, @NotNull $Type$Container rhs) {
        $Type$HashSet copy = new $Type$HashSet(lhs);
        copy.addAll(rhs);
        return copy;
    }

    public static @NotNull $Type$HashSet intersect(@NotNull $Type$Container lhs, @NotNull $Type$LookupContainer rhs) {
        $Type$HashSet copy = new $Type$HashSet(lhs);
        copy.retainAll(rhs);
        return copy;
    }

    public static @NotNull $Type$HashSet subtract(@NotNull $Type$Container lhs, @NotNull $Type$Container rhs) {
        $Type$HashSet copy = new $Type$HashSet(lhs);
        copy.removeAll(rhs);
        return copy;
    }

    public static @NotNull $Type$HashSet retainAllCopy(@NotNull $Type$Container container, @NotNull $Type$Predicate predicate) {
        $Type$HashSet copy = new $Type$HashSet(container);
        copy.retainAll(predicate);
        return copy;
    }

    public static @NotNull $Type$HashSet removeAllCopy(@NotNull $Type$Container container, @NotNull $Type$Predicate predicate) {
        $Type$HashSet copy = new $Type$HashSet(container);
        copy.removeAll(predicate);
        return copy;
    }
/*= end =*/
}
