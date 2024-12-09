// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface FailedAction<TError> {
    val type: Type /* 'failed' */
    val failureCount: Int
    val error: TError?
}
