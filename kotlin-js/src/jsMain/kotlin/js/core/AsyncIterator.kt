package js.core

import js.promise.Promise

sealed external interface AsyncIterator<out T> {
    fun next(): Promise<IteratorResult<T, *>>
}
