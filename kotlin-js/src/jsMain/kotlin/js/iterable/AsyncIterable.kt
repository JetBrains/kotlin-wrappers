package js.iterable

external interface AsyncIterable<out T> :
    AsyncIteratorSymbolHolder<() -> AsyncIterator<T>>
