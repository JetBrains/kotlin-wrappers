package js.collections

import js.iterable.JsIterator

external interface SetLike<out T> {
    val size: Int
    fun has(value: @UnsafeVariance T): Boolean
    fun keys(): JsIterator<T>
}
