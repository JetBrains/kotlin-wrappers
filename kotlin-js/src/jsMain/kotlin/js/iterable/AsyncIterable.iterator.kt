package js.iterable

import js.core.Symbol

@PublishedApi
internal fun <T> iteratorFor(
    source: AsyncIterable<T>,
): SuspendableIterator<T> =
    source[Symbol.asyncIterator]().iterator()
