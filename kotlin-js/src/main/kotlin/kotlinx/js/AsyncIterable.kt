package kotlinx.js

external interface AsyncIterable<T> :
    HasSymbol.asyncIterator<() -> AsyncIterator<T, Void>> {

    interface Iterator<T> :
        AsyncIterator<T, Void>,
        HasSymbol.asyncIterator<() -> Iterator<T>>
}
