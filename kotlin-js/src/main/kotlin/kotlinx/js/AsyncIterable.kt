package kotlinx.js

external interface AsyncIterable<T> {
    interface Iterator<T> : AsyncIterator<T, Void>
}

fun <T> AsyncIterable<T>.asyncIterator(): AsyncIterator<T, Void> =
    asDynamic()[Symbol.asyncIterator]()

fun <T> AsyncIterable.Iterator<T>.asyncIterator(): AsyncIterable.Iterator<T> =
    asDynamic()[Symbol.asyncIterator]()
