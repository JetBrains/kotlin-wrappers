package js.collections

import js.core.JsAny

external interface ReadonlySet<out T : JsAny?> :
    CollectionLike<@UnsafeVariance T, T>,
    ReadonlySetLike<T> {

    override val size: Int

    override fun has(key: @UnsafeVariance T): Boolean
}
