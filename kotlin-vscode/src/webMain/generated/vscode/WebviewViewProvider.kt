// Automatically generated - do not modify!

package vscode

import js.core.Void
import js.promise.PromiseLike

/**
 * Provider for creating `WebviewView` elements.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewViewProvider)
 */
external interface WebviewViewProvider {
    /**
     * Resolves a webview view.
     *
     * `resolveWebviewView` is called when a view first becomes visible. This may happen when the view is
     * first loaded or when the user hides and then shows a view again.
     *
     * @param webviewView Webview view to restore. The provider should take ownership of this view. The
     *    provider must set the webview's `.html` and hook up all webview events it is interested in.
     * @param context Additional metadata about the view being resolved.
     * @param token Cancellation token indicating that the view being provided is no longer needed.
     *
     * @returns Optional thenable indicating that the view has been fully resolved.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WebviewViewProvider.resolveWebviewView)
     */
    fun resolveWebviewView(
        webviewView: WebviewView,
        context: WebviewViewResolveContext<*>,
        token: CancellationToken,
    ): PromiseLike<Void>?
}
