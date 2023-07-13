package js.iterable

import js.core.Symbol

operator fun <T> AsyncIterable<T>.iterator(): SuspendableIterator<T> =
    get(Symbol.asyncIterator)().iterator()
