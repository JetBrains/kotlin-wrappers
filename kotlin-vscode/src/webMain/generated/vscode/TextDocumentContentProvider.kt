// Automatically generated - do not modify!

package vscode

import kotlin.js.JsString

/**
 * A text document content provider allows to add readonly documents
 * to the editor, such as source from a dll or generated html from md.
 *
 * Content providers are [registered][workspace.registerTextDocumentContentProvider]
 * for a [uri-scheme][Uri.scheme]. When a uri with that scheme is to
 * be [loaded][workspace.openTextDocument] the content provider is
 * asked.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentContentProvider)
 */
external interface TextDocumentContentProvider {
    /**
     * An event to signal a resource has changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentContentProvider.onDidChange)
     */
    var onDidChange: Event<Uri>?

    /**
     * Provide textual content for a given uri.
     *
     * The editor will use the returned string-content to create a readonly
     * [document][TextDocument]. Resources allocated should be released when
     * the corresponding document has been [closed][workspace.onDidCloseTextDocument].
     *
     * **Note**: The contents of the created [document][TextDocument] might not be
     * identical to the provided text due to end-of-line-sequence normalization.
     *
     * @param uri An uri which scheme matches the scheme this provider was [registered][workspace.registerTextDocumentContentProvider] for.
     * @param token A cancellation token.
     * @returns A string or a thenable that resolves to such.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentContentProvider.provideTextDocumentContent)
     */
    fun provideTextDocumentContent(
        uri: Uri,
        token: CancellationToken,
    ): ProviderResult<JsString>
}
