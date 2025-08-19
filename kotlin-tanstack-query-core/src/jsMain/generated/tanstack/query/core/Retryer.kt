// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject
import js.promise.Promise

@JsPlainObject
external interface Retryer<TData> {
    val promise: Promise<TData>
    val cancel: (cancelOptions: CancelOptions?) -> Unit
    val `continue`: () -> Promise<*>
    val cancelRetry: () -> Unit
    val continueRetry: () -> Unit
    val canStart: () -> Boolean
    val start: () -> Promise<TData>
    val status: () -> QueryStatus /* 'pending' | 'resolved' | 'rejected' */
}
