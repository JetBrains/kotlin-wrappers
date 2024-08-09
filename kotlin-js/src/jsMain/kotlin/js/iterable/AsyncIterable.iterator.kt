package js.iterable

import js.symbol.Symbol

@PublishedApi
internal fun <T> iteratorFromAsyncIterable(
    source: AsyncIterable<T>,
): SuspendableIterator<T> =
    source[Symbol.asyncIterator]().iterator()
