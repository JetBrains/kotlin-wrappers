// Automatically generated - do not modify!

package vscode

/**
 * A text document content provider allows to add readonly documents
 * to the editor, such as source from a dll or generated html from md.
 *
 * Content providers are {@link workspace.registerTextDocumentContentProvider registered}
 * for a {@link Uri.scheme uri-scheme}. When a uri with that scheme is to
 * be {@link workspace.openTextDocument loaded} the content provider is
 * asked.
 */
external interface TextDocumentContentProvider {
    /**
     * An event to signal a resource has changed.
     */
    var onDidChange: Event<Uri>?

    /**
     * Provide textual content for a given uri.
     *
     * The editor will use the returned string-content to create a readonly
     * {@link TextDocument document}. Resources allocated should be released when
     * the corresponding document has been {@link workspace.onDidCloseTextDocument closed}.
     *
     * **Note**: The contents of the created {@link TextDocument document} might not be
     * identical to the provided text due to end-of-line-sequence normalization.
     *
     * @param uri An uri which scheme matches the scheme this provider was {@link workspace.registerTextDocumentContentProvider registered} for.
     * @param token A cancellation token.
     * @returns A string or a thenable that resolves to such.
     */
    fun provideTextDocumentContent(
        uri: Uri,
        token: CancellationToken,
    ): ProviderResult<String>
}
