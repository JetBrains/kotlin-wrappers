package react

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RefObject<T : Any> :
    Ref<T> {
    var current: T?
}
