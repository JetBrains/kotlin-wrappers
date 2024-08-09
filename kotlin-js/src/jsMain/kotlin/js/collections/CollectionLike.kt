package js.collections

import js.array.JsTuple2
import js.iterable.JsIterable
import js.iterable.JsIterator

external interface CollectionLike<K, out V> :
    JsIterable<V> {

    fun entries(): JsIterator<JsTuple2<K, V>>
    fun keys(): JsIterator<K>
    fun values(): JsIterator<V>

    fun forEach(action: (item: V) -> Unit)
}
