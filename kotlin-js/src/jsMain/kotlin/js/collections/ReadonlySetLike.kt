package js.collections

import js.iterable.JsIterator

external interface ReadonlySetLike<out T> {
    val size: Int
    fun has(key: @UnsafeVariance T): Boolean
    fun keys(): JsIterator<T>
}
