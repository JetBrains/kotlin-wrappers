package js.iterable.internal

import js.core.JsAny
import js.internal.InternalApi
import js.iterable.JsIteratorLike
import js.iterable.isYield

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
