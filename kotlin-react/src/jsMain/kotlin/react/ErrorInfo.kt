package react

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ErrorInfo {
    /**
     * Captures which component contained the exception, and its ancestors.
     */
    val componentStack: String?
}
