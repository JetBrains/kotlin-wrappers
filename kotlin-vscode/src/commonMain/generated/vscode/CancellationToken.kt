// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * A cancellation token is passed to an asynchronous or long running
 * operation to request cancellation, like cancelling a request
 * for completion items because the user continued to type.
 *
 * To get an instance of a `CancellationToken` use a
 * [CancellationTokenSource].
 */
external interface CancellationToken {
    /**
     * Is `true` when the token has been cancelled, `false` otherwise.
     */
    var isCancellationRequested: Boolean

    /**
     * An [Event] which fires upon cancellation.
     */
    var onCancellationRequested: Event<JsAny?>
}
