package js.iterable

sealed external interface AsyncIterableIterator<out T> :
    AsyncIterator<T>,
    AsyncIteratorSymbolHolder<() -> AsyncIterableIterator<T>>
