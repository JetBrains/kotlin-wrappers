package js.iterable

external interface AsyncIterable<out T> :
    HasSymbol.asyncIterator<() -> AsyncIterator<T>>
