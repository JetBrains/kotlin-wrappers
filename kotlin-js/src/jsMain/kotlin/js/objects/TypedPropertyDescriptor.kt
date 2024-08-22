package js.objects

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface TypedPropertyDescriptor<T> {
    var configurable: Boolean?
    var enumerable: Boolean?
    var value: T?
    var writable: Boolean?
    var get: (() -> T)?
    var set: ((v: T) -> Unit)?
}
