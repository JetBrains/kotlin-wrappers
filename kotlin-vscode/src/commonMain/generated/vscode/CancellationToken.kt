// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import js.objects.JsPlainObject

/**
 * A cancellation token is passed to an asynchronous or long running
 * operation to request cancellation, like cancelling a request
 * for completion items because the user continued to type.
 *
 * To get an instance of a `CancellationToken` use a
 * [CancellationTokenSource].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CancellationToken)
 */
@JsPlainObject
external interface CancellationToken {
    /**
     * Is `true` when the token has been cancelled, `false` otherwise.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CancellationToken.isCancellationRequested)
     */
    var isCancellationRequested: Boolean

    /**
     * An [Event] which fires upon cancellation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CancellationToken.onCancellationRequested)
     */
    var onCancellationRequested: Event<JsAny?>
}
