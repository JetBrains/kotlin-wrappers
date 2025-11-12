// Automatically generated - do not modify!

package vscode

import js.core.Void

/**
 * The document range semantic tokens provider interface defines the contract between extensions and
 * semantic tokens.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentRangeSemanticTokensProvider)
 */
external interface DocumentRangeSemanticTokensProvider {
    /**
     * An optional event to signal that the semantic tokens from this provider have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentRangeSemanticTokensProvider.onDidChangeSemanticTokens)
     */
    var onDidChangeSemanticTokens: Event<Void>?

    /**
     * @see [provideDocumentSemanticTokens][DocumentSemanticTokensProvider.provideDocumentSemanticTokens].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentRangeSemanticTokensProvider.provideDocumentRangeSemanticTokens)
     */
    fun provideDocumentRangeSemanticTokens(
        document: TextDocument,
        range: Range,
        token: CancellationToken,
    ): ProviderResult<SemanticTokens>
}
