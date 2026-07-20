package js.collections

import js.array.Tuple2
import js.iterable.JsIterable
import js.iterable.JsIterator

external interface CollectionLike<K : JsAny?, out V : JsAny?> :
    JsIterable<V> {

    fun entries(): JsIterator<Tuple2<K, V>>
    fun keys(): JsIterator<K>
    fun values(): JsIterator<V>

    fun forEach(action: (item: V) -> Unit)

    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    interface Mixin<K : JsAny?, out V : JsAny?> :
        CollectionLike<K, V> {
        override fun entries(): JsIterator<Tuple2<K, V>> = definedExternally
        override fun keys(): JsIterator<K> = definedExternally
        override fun values(): JsIterator<V> = definedExternally

        override fun forEach(action: (item: V) -> Unit) = definedExternally
    }
}
