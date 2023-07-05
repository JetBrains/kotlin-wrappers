package js.collections

import js.core.IterableIterator
import js.core.JsIterable
import js.core.JsTuple2

external interface MapLike<K, out V> :
    JsIterable<JsTuple2<K, V>> {

    fun entries(): IterableIterator<JsTuple2<K, V>>
    fun keys(): IterableIterator<K>
    fun values(): IterableIterator<V>

    fun forEach(action: (value: V, key: K) -> Unit)
}
