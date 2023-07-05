package js.collections

import js.core.AsyncIterable
import js.core.AsyncIterableIterator
import js.core.JsTuple2

external interface AsyncMapLike<K, out V> :
    AsyncIterable<JsTuple2<K, V>> {

    fun entries(): AsyncIterableIterator<JsTuple2<K, V>>
    fun keys(): AsyncIterableIterator<K>
    fun values(): AsyncIterableIterator<V>
}
