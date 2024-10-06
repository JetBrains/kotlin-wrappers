package js.objects

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface TypedPropertyDescriptor<T> {
    val configurable: Boolean?
    val enumerable: Boolean?
    val value: T?
    val writable: Boolean?
    val get: (() -> T)?
    val set: ((v: T) -> Unit)?
}
