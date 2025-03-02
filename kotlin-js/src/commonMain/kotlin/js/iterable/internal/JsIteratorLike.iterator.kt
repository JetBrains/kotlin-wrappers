package js.iterable.internal

import js.iterable.IteratorYieldResult
import js.iterable.JsIteratorLike

@PublishedApi
internal fun <T> iteratorFromJsIteratorLike(
    source: JsIteratorLike<T>,
): Iterator<T> =
    generateSequence { source.next() as? IteratorYieldResult<T> }
        .map { it.value }
        .iterator()
