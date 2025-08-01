// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents edits to semantic tokens.
 * @see [provideDocumentSemanticTokensEdits][DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits] for an explanation of the format.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensEdits)
 */
open external class SemanticTokensEdits {
    /**
     * The result id of the tokens.
     *
     * This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensEdits.resultId)
     */
    val resultId: String?

    /**
     * The edits to the tokens data.
     * All edits refer to the initial data state.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensEdits.edits)
     */
    val edits: ReadonlyArray<SemanticTokensEdit>

    /**
     * Create new semantic tokens edits.
     *
     * @param edits An array of semantic token edits
     * @param resultId Result identifier.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensEdits.constructor)
     */
    constructor(
        edits: ReadonlyArray<SemanticTokensEdit>,
        resultId: String = definedExternally,
    )
}
