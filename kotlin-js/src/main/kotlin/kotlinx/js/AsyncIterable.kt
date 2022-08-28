package kotlinx.js

external interface AsyncIterable<out T> :
    HasSymbol.asyncIterator<() -> AsyncIterator<T, Void>> {

    interface Iterator<out T> :
        AsyncIterator<T, Void>,
        HasSymbol.asyncIterator<() -> Iterator<T>>
}
