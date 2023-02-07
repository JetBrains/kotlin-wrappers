package js.collections

import js.core.JsIterable
import js.core.JsTuple2

external interface ReadonlySet<out T> :
    JsIterable<T> {

    val size: Int

    fun entries(): JsIterable.Iterator<JsTuple2<T, T>>
    fun forEach(action: (value: T) -> Unit)
    fun has(value: @UnsafeVariance T): Boolean
    fun keys(): JsIterable.Iterator<T>
    fun values(): JsIterable.Iterator<T>
}
