package js.collections

import js.core.IterableIterator
import js.core.JsIterable
import js.core.JsTuple2

external interface CollectionLike<K, out V> :
    JsIterable<V> {

    fun entries(): IterableIterator<JsTuple2<K, V>>
    fun keys(): IterableIterator<K>
    fun values(): IterableIterator<V>

    fun forEach(action: (item: V) -> Unit)
}
