package js.collections

import js.array.Tuple2
import js.internal.InternalApi
import js.iterable.AsyncIterable
import js.iterable.AsyncIterator

external interface AsyncMapLike<K : JsAny?, out V : JsAny?> :
    AsyncIterable<Tuple2<K, V>> {

    fun entries(): AsyncIterator<Tuple2<K, V>>
    fun keys(): AsyncIterator<K>
    fun values(): AsyncIterator<V>

    @SubclassOptInRequired(InternalApi::class)
    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    interface Mixin<K : JsAny?, out V : JsAny?> :
        AsyncMapLike<K, V>,
        AsyncIterable.Mixin<Tuple2<K, V>> {

        override fun entries(): AsyncIterator<Tuple2<K, V>> = definedExternally
        override fun keys(): AsyncIterator<K> = definedExternally
        override fun values(): AsyncIterator<V> = definedExternally
    }
}
