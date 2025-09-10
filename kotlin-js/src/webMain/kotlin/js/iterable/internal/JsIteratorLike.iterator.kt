package js.iterable.internal

import js.internal.InternalApi
import js.iterable.JsIteratorLike
import js.iterable.isYield
import kotlin.js.JsAny

@InternalApi
@PublishedApi
internal fun <T : JsAny?> iteratorFromJsIteratorLike(
    source: JsIteratorLike<T>,
): Iterator<T> =
    generateSequence {
        val result = source.next()
        if (isYield(result)) result else null
    }.map { it.value }
        .iterator()
