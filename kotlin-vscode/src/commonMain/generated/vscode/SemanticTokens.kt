// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Represents semantic tokens, either in a range or in an entire document.
 * @see {@link DocumentSemanticTokensProvider.provideDocumentSemanticTokens provideDocumentSemanticTokens} for an explanation of the format.
 * @see {@link SemanticTokensBuilder} for a helper to create an instance.
*/
export class SemanticTokens {
/**
 * The result id of the tokens.
 *
 * This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
*/
readonly resultId: string | undefined;
/**
 * The actual tokens data.
 * @see {@link DocumentSemanticTokensProvider.provideDocumentSemanticTokens provideDocumentSemanticTokens} for an explanation of the format.
*/
readonly data: Uint32Array;

/**
 * Create new semantic tokens.
 *
 * @param data Token data.
 * @param resultId Result identifier.
*/
constructor(data: Uint32Array, resultId?: string);
}

// ORIGINAL SOURCE
 **/
