package js.collections

import js.internal.InternalApi
import js.iterable.JsIterator

external interface ReadonlySetLike<out T : JsAny?> {
    val size: Int
    fun has(key: @UnsafeVariance T): Boolean
    fun keys(): JsIterator<T>

    @SubclassOptInRequired(InternalApi::class)
    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    interface Mixin<out T : JsAny?> :
        ReadonlySetLike<T> {
        override val size: Int
            get() = definedExternally

        override fun has(key: @UnsafeVariance T): Boolean = definedExternally
        override fun keys(): JsIterator<T> = definedExternally
    }
}
