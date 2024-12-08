package react

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MutableRefObject<T : Any> :
    RefObject<T> {
    override var current: T?
}
