package react

import js.objects.JsPlainObject

@JsPlainObject
external interface ErrorInfo {
    /**
     * Captures which component contained the exception, and its ancestors.
     */
    val componentStack: String?
    val digest: String?
}
