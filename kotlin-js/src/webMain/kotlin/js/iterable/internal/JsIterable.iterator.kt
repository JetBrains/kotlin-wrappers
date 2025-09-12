package js.iterable.internal

import js.internal.InternalApi
import js.iterable.JsIterable
import js.iterable.isYield
import js.symbol.Symbol
import kotlin.js.JsAny

@InternalApi
@PublishedApi
internal fun <T : JsAny?> iteratorFromJsIterable(
    source: JsIterable<T>,
): Iterator<T> {
    val iterator = source[Symbol.iterator]()
    return generateSequence {
        val result = iterator.next()
        if (isYield(result)) result else null
    }.map { it.value }
        .iterator()
}
