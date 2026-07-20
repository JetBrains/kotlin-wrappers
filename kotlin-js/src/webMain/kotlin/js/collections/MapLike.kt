package js.collections

import js.array.Tuple2
import js.internal.InternalApi
import js.iterable.JsIterable
import js.iterable.JsIterator

external interface MapLike<K : JsAny?, out V : JsAny?> :
    JsIterable<Tuple2<K, V>> {

    fun entries(): JsIterator<Tuple2<K, V>>
    fun keys(): JsIterator<K>
    fun values(): JsIterator<V>

    fun forEach(action: (value: V, key: K) -> Unit)

    @SubclassOptInRequired(InternalApi::class)
    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    interface Mixin<K : JsAny?, out V : JsAny?> :
        MapLike<K, V> {
        override fun entries(): JsIterator<Tuple2<K, V>> = definedExternally
        override fun keys(): JsIterator<K> = definedExternally
        override fun values(): JsIterator<V> = definedExternally

        override fun forEach(action: (value: V, key: K) -> Unit): Unit = definedExternally
    }
}
