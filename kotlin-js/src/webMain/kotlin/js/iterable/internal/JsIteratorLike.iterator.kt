package js.iterable.internal

import js.core.JsAny
import js.internal.InternalApi
import js.iterable.IteratorYieldResult
import js.iterable.JsIteratorLike

@InternalApi
@PublishedApi
internal fun <T : JsAny?> iteratorFromJsIteratorLike(
    source: JsIteratorLike<T>,
): Iterator<T> =
    generateSequence { source.next() as? IteratorYieldResult<T> }
        .map { it.value }
        .iterator()
