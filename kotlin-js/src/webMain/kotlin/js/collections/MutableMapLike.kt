package js.collections

import js.internal.InternalApi

external interface MutableMapLike<K : JsAny?, V : JsAny?> :
    ReadonlyMap<K, V> {

    fun clear()
    fun delete(key: K): Boolean
    fun set(key: K, value: V)

    @SubclassOptInRequired(InternalApi::class)
    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    interface Mixin<K : JsAny?, V : JsAny?> :
        MutableMapLike<K, V>,
        ReadonlyMap.Mixin<K, V> {

        override fun clear(): Unit = definedExternally
        override fun delete(key: K): Boolean = definedExternally
        override fun set(key: K, value: V): Unit = definedExternally
    }
}
