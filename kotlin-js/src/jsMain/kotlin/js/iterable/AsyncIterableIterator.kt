package js.iterable

sealed external interface AsyncIterableIterator<out T> :
    AsyncIterator<T>,
    HasSymbol.asyncIterator<() -> AsyncIterableIterator<T>>
