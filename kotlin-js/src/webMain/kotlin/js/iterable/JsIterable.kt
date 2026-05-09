package js.iterable

import js.hacks.safeMethod
import js.symbol.Symbol

external interface JsIterable<out T : JsAny?>

operator fun <T : JsAny?> JsIterable<T>.get(
    key: Symbol.iterator,
): () -> JsIterator<T> =
    safeMethod(Symbol.iterator)

operator fun <T : JsAny?> JsIterable<T>.iterator(): Iterator<T> {
    val iterator = this[Symbol.iterator]()
    return generateSequence {
        val result = iterator.next()
        if (isYield(result)) result else null
    }.map { it.value }
        .iterator()
}
