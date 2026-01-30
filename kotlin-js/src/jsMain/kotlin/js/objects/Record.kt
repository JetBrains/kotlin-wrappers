package js.objects

import js.array.Tuple2

fun <V> Iterable<Pair<String, V>>.toRecord(): Record<String, V> =
    toReadonlyRecord().unsafeCast<Record<String, V>>()

fun <V> Sequence<Tuple2<String, V>>.toRecord(): Record<String, V> =
    toReadonlyRecord().unsafeCast<Record<String, V>>()

fun <V> Sequence<Pair<String, V>>.toRecord(): Record<String, V> =
    toReadonlyRecord().unsafeCast<Record<String, V>>()

fun <V> Map<String, V>.toRecord(): Record<String, V> =
    toReadonlyRecord().unsafeCast<Record<String, V>>()
