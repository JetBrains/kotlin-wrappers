package js.collections

import js.core.JsAny
import js.iterable.JsIterator

external interface ReadonlySetLike<out T : JsAny?> {
    val size: Int
    fun has(key: @UnsafeVariance T): Boolean
    fun keys(): JsIterator<T>
}
