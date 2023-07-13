package js.collections

import js.core.JsTuple2
import js.iterable.IterableIterator
import js.iterable.JsIterable

external interface MapLike<K, out V> :
    JsIterable<JsTuple2<K, V>> {

    fun entries(): IterableIterator<JsTuple2<K, V>>
    fun keys(): IterableIterator<K>
    fun values(): IterableIterator<V>

    fun forEach(action: (value: V, key: K) -> Unit)
}
