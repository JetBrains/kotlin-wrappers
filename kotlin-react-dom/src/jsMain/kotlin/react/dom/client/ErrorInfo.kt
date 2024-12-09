package react.dom.client

import js.objects.JsPlainObject

@JsPlainObject
external interface ErrorInfo {
    val componentStack: String?
}
