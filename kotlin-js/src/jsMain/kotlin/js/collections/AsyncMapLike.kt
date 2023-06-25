package js.collections

import js.core.AsyncIterable
import js.core.JsTuple2

external interface AsyncMapLike<K, out V> :
    AsyncIterable<JsTuple2<K, V>> {

    fun entries(): AsyncIterable.Iterator<JsTuple2<K, V>>
    fun keys(): AsyncIterable.Iterator<K>
    fun values(): AsyncIterable.Iterator<V>
}
