package js.collections

import js.iterable.JsIterator

external interface ReadonlySetLike<out T : JsAny?> {
    val size: Int
    fun has(key: @UnsafeVariance T): Boolean
    fun keys(): JsIterator<T>
}
