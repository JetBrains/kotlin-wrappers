// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.typedarrays.Uint32Array
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents semantic tokens, either in a range or in an entire document.
 * @see {@link DocumentSemanticTokensProvider.provideDocumentSemanticTokens provideDocumentSemanticTokens} for an explanation of the format.
 * @see [SemanticTokensBuilder] for a helper to create an instance.
 */
open external class SemanticTokens {
    /**
     * The result id of the tokens.
     *
     * This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
     */
    val resultId: String?

    /**
     * The actual tokens data.
     * @see {@link DocumentSemanticTokensProvider.provideDocumentSemanticTokens provideDocumentSemanticTokens} for an explanation of the format.
     */
    val data: Uint32Array<*>

    /**
     * Create new semantic tokens.
     *
     * @param data Token data.
     * @param resultId Result identifier.
     */
    constructor(
        data: Uint32Array<*>,
        resultId: String = definedExternally,
    )
}
