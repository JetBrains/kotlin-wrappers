package js.iterable

import js.hacks.safeFactory
import js.symbol.Symbol
import kotlin.js.JsAny

external interface JsIterable<out T : JsAny?>

operator fun <T : JsAny?> JsIterable<T>.get(
    key: Symbol.iterator,
): () -> JsIterator<T> =
    safeFactory(Symbol.iterator)

operator fun <T : JsAny?> JsIterable<T>.iterator(): Iterator<T> {
    val iterator = this[Symbol.iterator]()
    return generateSequence {
        val result = iterator.next()
        if (isYield(result)) result else null
    }.map { it.value }
        .iterator()
}
