package js.iterable

import js.hacks.safeMethod
import js.symbol.Symbol

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#the_iterable_protocol)
 */
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
