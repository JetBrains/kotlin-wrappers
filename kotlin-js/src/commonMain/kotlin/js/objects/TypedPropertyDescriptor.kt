package js.objects

import js.core.JsAny

@JsPlainObject
external interface TypedPropertyDescriptor<T : JsAny?> {
    var configurable: Boolean?
    var enumerable: Boolean?
    var value: T?
    var writable: Boolean?
    var get: (() -> T)?
    var set: ((v: T) -> Unit)?
}
