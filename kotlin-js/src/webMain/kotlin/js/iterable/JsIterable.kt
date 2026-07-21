@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
    "INTERFACE_WITH_SUPERCLASS",
)

package js.iterable

import js.hacks.safeCall
import js.internal.InternalApi
import js.symbol.Symbol

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#the_iterable_protocol)
 */
expect external interface JsIterable<out T : JsAny?> :
    JsAny {

    @SubclassOptInRequired(InternalApi::class)
    interface Mixin<out T : JsAny?> :
        JsIterable<T>
}

fun <T : JsAny?> JsIterable<T>.`[@@iterator]`(): JsIterator<T> =
    safeCall(Symbol.iterator)

operator fun <T : JsAny?> JsIterable<T>.iterator(): Iterator<T> {
    val iterator = this.`[@@iterator]`()
    return generateSequence {
        val result = iterator.next()
        if (isYield(result)) result else null
    }.map { it.value }
        .iterator()
}
