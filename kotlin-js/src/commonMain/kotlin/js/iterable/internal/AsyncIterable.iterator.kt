package js.iterable.internal

import js.core.JsAny
import js.iterable.AsyncIterable
import js.iterable.SuspendableIterator
import js.symbol.Symbol

@PublishedApi
internal fun <T : JsAny?> iteratorFromAsyncIterable(
    source: AsyncIterable<T>,
): SuspendableIterator<T> =
    source[Symbol.asyncIterator]().iterator()
