package js.collections

import js.internal.InternalApi
import js.iterable.JsIterator

external interface ReadonlyMap<K : JsAny?, out V : JsAny?> :
    MapLike<K, V>,
    ReadonlySetLike<K> {

    fun get(key: K): V?

    @SubclassOptInRequired(InternalApi::class)
    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    interface Mixin<K : JsAny?, out V : JsAny?> :
        ReadonlyMap<K, V>,
        MapLike.Mixin<K, V>,
        ReadonlySetLike.Mixin<K> {

        override fun get(key: K): V? = definedExternally
        override fun keys(): JsIterator<K> = definedExternally
    }
}
