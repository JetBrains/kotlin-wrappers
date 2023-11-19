// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise

external interface Retryer<TData> {
    var promise: Promise<TData>
    var cancel: (cancelOptions: CancelOptions?) -> Unit
    var `continue`: () -> Promise<Any?>
    var cancelRetry: () -> Unit
    var continueRetry: () -> Unit
}
