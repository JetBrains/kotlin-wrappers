package js.collections

import js.array.Tuple2
import js.iterable.JsIterable
import js.iterable.JsIterator
import kotlin.js.JsAny

external interface CollectionLike<K : JsAny?, out V : JsAny?> :
    JsIterable<V> {

    fun entries(): JsIterator<Tuple2<K, V>>
    fun keys(): JsIterator<K>
    fun values(): JsIterator<V>

    fun forEach(action: (item: V) -> Unit)
}
