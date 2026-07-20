package js.collections

import js.internal.InternalApi
import js.iterable.JsIterator

external interface ReadonlySet<out T : JsAny?> :
    CollectionLike<@UnsafeVariance T, T>,
    ReadonlySetLike<T> {

    override val size: Int

    override fun has(key: @UnsafeVariance T): Boolean

    @SubclassOptInRequired(InternalApi::class)
    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    interface Mixin<out T : JsAny?> :
        ReadonlySet<T>,
        CollectionLike.Mixin<@UnsafeVariance T, T>,
        ReadonlySetLike.Mixin<T> {

        override val size: Int
            get() = definedExternally

        override fun has(key: @UnsafeVariance T): Boolean = definedExternally
        override fun keys(): JsIterator<T> = definedExternally
    }
}
