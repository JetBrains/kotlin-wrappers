// Automatically generated - do not modify!

package vscode

/**
 * The document range semantic tokens provider interface defines the contract between extensions and
 * semantic tokens.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentRangeSemanticTokensProvider)
 */
external interface DocumentRangeSemanticTokensProvider {
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
