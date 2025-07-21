// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * The document range semantic tokens provider interface defines the contract between extensions and
 * semantic tokens.
*/
export interface DocumentRangeSemanticTokensProvider {
/**
 * @see {@link DocumentSemanticTokensProvider.provideDocumentSemanticTokens provideDocumentSemanticTokens}.
*/
provideDocumentRangeSemanticTokens(document: TextDocument, range: Range, token: CancellationToken): ProviderResult<SemanticTokens>;
}

// ORIGINAL SOURCE
 **/
