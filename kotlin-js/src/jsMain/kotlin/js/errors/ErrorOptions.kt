package js.errors

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ErrorOptions {
    val cause: JsError?
}
