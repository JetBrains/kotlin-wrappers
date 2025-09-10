package js.collections

import js.iterable.JsIterator
import kotlin.js.JsAny

external interface ReadonlySetLike<out T : JsAny?> {
    val size: Int
    fun has(key: @UnsafeVariance T): Boolean
    fun keys(): JsIterator<T>
}
