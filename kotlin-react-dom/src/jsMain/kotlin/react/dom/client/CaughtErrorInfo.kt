package react.dom.client

import kotlinx.js.JsPlainObject
import react.Component

@JsPlainObject
external interface CaughtErrorInfo :
    ErrorInfo {
    val errorBoundary: Component<*, *>?
}
