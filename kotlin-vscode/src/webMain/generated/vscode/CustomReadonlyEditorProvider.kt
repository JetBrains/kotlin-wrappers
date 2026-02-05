// Automatically generated - do not modify!

package vscode

import js.core.Void
import js.promise.PromiseLike
import js.promise.PromiseResult

/**
 * Provider for readonly custom editors that use a custom document model.
 *
 * Custom editors use [CustomDocument] as their document model instead of a [TextDocument].
 *
 * You should use this type of custom editor when dealing with binary files or more complex scenarios. For simple
 * text based documents, use [CustomTextEditorProvider] instead.
 *
 * @param T Type of the custom document returned by this provider.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomReadonlyEditorProvider)
 */
external interface CustomReadonlyEditorProvider<T : CustomDocument> {
    /**
     * Create a new document for a given resource.
     *
     * `openCustomDocument` is called when the first time an editor for a given resource is opened. The opened
     * document is then passed to [resolveCustomEditor] so that the editor can be shown to the user.
     *
     * Already opened [CustomDocuments][CustomDocument] are re-used if the user opened additional editors. When all editors for a
     * given resource are closed, the [CustomDocuments][CustomDocument] is disposed of. Opening an editor at this point will
     * trigger another call to `openCustomDocument`.
     *
     * @param uri Uri of the document to open.
     * @param openContext Additional information about the opening custom document.
     * @param token A cancellation token that indicates the result is no longer needed.
     *
     * @returns The custom document.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomReadonlyEditorProvider.openCustomDocument)
     */
    fun openCustomDocument(
        uri: Uri,
        openContext: CustomDocumentOpenContext,
        token: CancellationToken,
    ): PromiseResult<T>

    /**
     * Resolve a custom editor for a given resource.
     *
     * This is called whenever the user opens a new editor for this `CustomEditorProvider`.
     *
     * @param document Document for the resource being resolved.
     *
     * @param webviewPanel The webview panel used to display the editor UI for this resource.
     *
     * During resolve, the provider must fill in the initial html for the content webview panel and hook up all
     * the event listeners on it that it is interested in. The provider can also hold onto the `WebviewPanel` to
     * use later for example in a command. See [WebviewPanel] for additional details.
     *
     * @param token A cancellation token that indicates the result is no longer needed.
     *
     * @returns Optional thenable indicating that the custom editor has been resolved.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomReadonlyEditorProvider.resolveCustomEditor)
     */
    fun resolveCustomEditor(
        document: T,
        webviewPanel: WebviewPanel,
        token: CancellationToken,
    ): PromiseLike<Void>?
}
