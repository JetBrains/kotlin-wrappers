package js.objects

import js.core.JsAny
import js.core.JsAnyMarker

@JsPlainObject
external interface TypedPropertyDescriptor<T : JsAny?> :
    JsAnyMarker {
    val configurable: Boolean?
    val enumerable: Boolean?
    val value: T?
    val writable: Boolean?
    val get: (() -> T)?
    val set: ((v: T) -> Unit)?
}
