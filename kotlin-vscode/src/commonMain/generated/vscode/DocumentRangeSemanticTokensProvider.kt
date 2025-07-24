// Automatically generated - do not modify!

package vscode

/**
 * The document range semantic tokens provider interface defines the contract between extensions and
 * semantic tokens.
 */
external interface DocumentRangeSemanticTokensProvider {
    /**
     * @see [provideDocumentSemanticTokens][DocumentSemanticTokensProvider.provideDocumentSemanticTokens].
     */
    fun provideDocumentRangeSemanticTokens(
        document: TextDocument,
        range: Range,
        token: CancellationToken,
    ): ProviderResult<SemanticTokens>
}
