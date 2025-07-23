// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A cancellation source creates and controls a {@link CancellationToken cancellation token}.
 */
open external class CancellationTokenSource {
    /**
     * The cancellation token of this source.
     */
    var token: CancellationToken

    /**
     * Signal cancellation on the token.
     */
    fun cancel()

    /**
     * Dispose object and free resources.
     */
    fun dispose()
}
