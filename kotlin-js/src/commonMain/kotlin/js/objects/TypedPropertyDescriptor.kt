package js.objects

import js.core.JsAny

@JsPlainObject
external interface TypedPropertyDescriptor<T : JsAny?> {
    val configurable: Boolean?
    val enumerable: Boolean?
    val value: T?
    val writable: Boolean?
    val get: (() -> T)?
    val set: ((v: T) -> Unit)?
}
