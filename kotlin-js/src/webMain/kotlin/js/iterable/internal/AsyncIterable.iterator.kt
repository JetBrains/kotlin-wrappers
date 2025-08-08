package js.iterable.internal

import js.core.JsAny
import js.internal.InternalApi
import js.iterable.AsyncIterable
import js.iterable.SuspendableIterator
import js.iterable.iterator
import js.symbol.Symbol

@InternalApi
@PublishedApi
internal fun <T : JsAny?> iteratorFromAsyncIterable(
    source: AsyncIterable<T>,
): SuspendableIterator<T> =
    source[Symbol.asyncIterator]().iterator()
