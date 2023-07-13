package js.collections

import js.core.JsTuple2
import js.iterable.IterableIterator
import js.iterable.JsIterable

external interface CollectionLike<K, out V> :
    JsIterable<V> {

    fun entries(): IterableIterator<JsTuple2<K, V>>
    fun keys(): IterableIterator<K>
    fun values(): IterableIterator<V>

    fun forEach(action: (item: V) -> Unit)
}
