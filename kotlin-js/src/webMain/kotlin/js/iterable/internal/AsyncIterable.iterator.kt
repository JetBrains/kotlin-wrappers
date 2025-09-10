package js.iterable.internal

import js.internal.InternalApi
import js.iterable.AsyncIterable
import js.iterable.SuspendIterator
import js.iterable.iterator
import js.symbol.Symbol
import kotlin.js.JsAny

@InternalApi
@PublishedApi
internal fun <T : JsAny?> iteratorFromAsyncIterable(
    source: AsyncIterable<T>,
): SuspendIterator<T> =
    source[Symbol.asyncIterator]().iterator()
