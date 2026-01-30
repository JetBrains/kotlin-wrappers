package js.objects

import js.array.Tuple2
import js.array.toTypedArray
import js.array.tupleOf

fun <V> Iterable<Pair<String, V>>.toReadonlyRecord(): ReadonlyRecord<String, V> =
    Object.fromEntries(map { (key, value) -> tupleOf(key, value) }.toTypedArray())

fun <V> Sequence<Tuple2<String, V>>.toReadonlyRecord(): ReadonlyRecord<String, V> =
    Object.fromEntries(toTypedArray())

fun <V> Sequence<Pair<String, V>>.toReadonlyRecord(): ReadonlyRecord<String, V> =
    Object.fromEntries(map { (key, value) -> tupleOf(key, value) }.toTypedArray())

fun <V> Map<String, V>.toReadonlyRecord(): ReadonlyRecord<String, V> =
    Object.fromEntries(map { (key, value) -> tupleOf(key, value) }.toTypedArray())
