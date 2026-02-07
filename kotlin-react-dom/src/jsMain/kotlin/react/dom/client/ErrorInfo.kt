package react.dom.client

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ErrorInfo {
    val componentStack: String?
}
