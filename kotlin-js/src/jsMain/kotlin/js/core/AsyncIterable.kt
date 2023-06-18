package js.core

external interface AsyncIterable<out T> :
    HasSymbol.asyncIterator<() -> AsyncIterator<T, *, *>> {

    interface Iterator<out T> :
        AsyncIterator<T, Any?, Void>,
        HasSymbol.asyncIterator<() -> Iterator<T>>
}
