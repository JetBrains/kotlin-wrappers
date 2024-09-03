package js.import

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface Module<out T : Any> {
    val default: T
}
