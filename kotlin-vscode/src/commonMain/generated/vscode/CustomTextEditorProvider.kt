// Automatically generated - do not modify!

package vscode

/**
 * Provider for text based custom editors.
 *
 * Text based custom editors use a {@linkcode TextDocument} as their data model. This considerably simplifies
 * implementing a custom editor as it allows the editor to handle many common operations such as
 * undo and backup. The provider is responsible for synchronizing text changes between the webview and the `TextDocument`.
 */
external interface CustomTextEditorProvider {
    /**
     * Resolve a custom editor for a given text resource.
     *
     * This is called when a user first opens a resource for a `CustomTextEditorProvider`, or if they reopen an
     * existing editor using this `CustomTextEditorProvider`.
     *
     *
     * @param document Document for the resource to resolve.
     *
     * @param webviewPanel The webview panel used to display the editor UI for this resource.
     *
     * During resolve, the provider must fill in the initial html for the content webview panel and hook up all
     * the event listeners on it that it is interested in. The provider can also hold onto the `WebviewPanel` to
     * use later for example in a command. See {@linkcode WebviewPanel} for additional details.
     *
     * @param token A cancellation token that indicates the result is no longer needed.
     *
     * @returns Thenable indicating that the custom editor has been resolved.
     */
    fun resolveCustomTextEditor(
        document: TextDocument,
        webviewPanel: WebviewPanel,
        token: CancellationToken,
    ): Any /* Thenable<void> | void */
}
