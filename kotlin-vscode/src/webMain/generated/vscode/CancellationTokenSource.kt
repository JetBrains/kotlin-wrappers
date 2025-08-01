// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * A cancellation source creates and controls a [cancellation token][CancellationToken].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CancellationTokenSource)
 */
open external class CancellationTokenSource :
    DisposableLike {
    /**
     * The cancellation token of this source.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CancellationTokenSource.token)
     */
    var token: CancellationToken

    /**
     * Signal cancellation on the token.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CancellationTokenSource.cancel)
     */
    fun cancel()

    /**
     * Dispose object and free resources.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CancellationTokenSource.dispose)
     */
    override fun dispose()
}
