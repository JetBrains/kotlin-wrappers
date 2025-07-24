// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * A cancellation source creates and controls a {@link CancellationToken cancellation token}.
 */
open external class CancellationTokenSource :
    DisposableLike {
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
    override fun dispose()
}
