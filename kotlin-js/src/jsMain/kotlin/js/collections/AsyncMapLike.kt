package js.collections

import js.core.JsTuple2
import js.iterable.AsyncIterable
import js.iterable.AsyncIterableIterator

external interface AsyncMapLike<K, out V> :
    AsyncIterable<JsTuple2<K, V>> {

    fun entries(): AsyncIterableIterator<JsTuple2<K, V>>
    fun keys(): AsyncIterableIterator<K>
    fun values(): AsyncIterableIterator<V>
}
