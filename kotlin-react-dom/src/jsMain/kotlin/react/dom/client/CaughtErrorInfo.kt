package react.dom.client

import js.objects.JsPlainObject
import react.Component

@JsPlainObject
external interface CaughtErrorInfo :
    ErrorInfo {
    val errorBoundary: Component<*, *>?
}
