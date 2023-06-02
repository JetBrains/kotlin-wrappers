package js.core

import js.collections.SuspendableIterator

operator fun <T> AsyncIterable<T>.iterator(): SuspendableIterator<T> =
    get(Symbol.asyncIterator)().iterator()
