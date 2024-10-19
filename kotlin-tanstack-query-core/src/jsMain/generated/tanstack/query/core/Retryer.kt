// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface Retryer<TData> {
    val promise: Promise<TData>
    val cancel: (cancelOptions: CancelOptions?) -> Unit
    val `continue`: () -> Promise<*>
    val cancelRetry: () -> Unit
    val continueRetry: () -> Unit
    val canStart: () -> Boolean
    val start: () -> Promise<TData>
}
