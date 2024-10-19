// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface Retryer<TData> {
    var promise: Promise<TData>
    var cancel: (cancelOptions: CancelOptions?) -> Unit
    var `continue`: () -> Promise<*>
    var cancelRetry: () -> Unit
    var continueRetry: () -> Unit
    var canStart: () -> Boolean
    var start: () -> Promise<TData>
}
