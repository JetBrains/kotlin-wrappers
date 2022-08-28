package kotlinx.js

external interface AsyncIterable<out T> :
    HasSymbol.asyncIterator<() -> AsyncIterator<T>> {

    interface Iterator<out T> :
        AsyncIterator<T>,
        HasSymbol.asyncIterator<() -> Iterator<T>>
}
