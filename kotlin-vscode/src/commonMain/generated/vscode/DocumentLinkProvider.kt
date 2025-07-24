// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * The document link provider defines the contract between extensions and feature of showing
 * links in the editor.
 */
external interface DocumentLinkProvider<T : DocumentLink> {
    /**
     * Provide links for the given document. Note that the editor ships with a default provider that detects
     * `http(s)` and `file` links.
     *
     * @param document The document in which the command was invoked.
     * @param token A cancellation token.
     * @returns An array of [document links][DocumentLink] or a thenable that resolves to such. The lack of a result
     * can be signaled by returning `undefined`, `null`, or an empty array.
     */
    fun provideDocumentLinks(
        document: TextDocument,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<T>>

    /**
     * Given a link fill in its [target][DocumentLink.target]. This method is called when an incomplete
     * link is selected in the UI. Providers can implement this method and return incomplete links
     * (without target) from the {@linkcode DocumentLinkProvider.provideDocumentLinks provideDocumentLinks} method which
     * often helps to improve performance.
     *
     * @param link The link that is to be resolved.
     * @param token A cancellation token.
     */
    var resolveDocumentLink: ((
        link: T,
        token: CancellationToken,
    ) -> ProviderResult<T>)?
}
