package js.collections

import js.internal.InternalApi

external interface MutableSetLike<T : JsAny?> :
    ReadonlySet<T> {

    fun add(value: T)
    fun clear()
    fun delete(value: T): Boolean

    @SubclassOptInRequired(InternalApi::class)
    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    interface Mixin<T : JsAny?> :
        MutableSetLike<T>,
        ReadonlySet.Mixin<T> {

        override fun add(value: T): Unit = definedExternally
        override fun clear(): Unit = definedExternally
        override fun delete(value: T): Boolean = definedExternally
    }
}
