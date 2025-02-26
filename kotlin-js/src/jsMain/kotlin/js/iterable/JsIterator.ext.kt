package js.iterable

import js.array.JsArrays
import js.array.ReadonlyArray

fun <T> JsIterator<T>.asSequence(): Sequence<T> =
    iterator().asSequence()

fun <T> JsIterator<T>.toArray(): ReadonlyArray<T> =
    JsArrays.from(this)

fun <T> JsIterator<T>.toList(): List<T> =
    toArray().toList()

fun <T> JsIterator<T>.toSet(): Set<T> =
    toArray().toSet()
