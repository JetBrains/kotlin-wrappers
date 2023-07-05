package js.core

external interface AsyncIterable<out T> :
    HasSymbol.asyncIterator<() -> AsyncIterator<T>>
