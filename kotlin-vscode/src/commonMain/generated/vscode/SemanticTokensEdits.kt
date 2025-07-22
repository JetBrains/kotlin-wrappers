// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents edits to semantic tokens.
 * @see {@link DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits provideDocumentSemanticTokensEdits} for an explanation of the format.
 */
open external class SemanticTokensEdits {
    /**
    // ORIGINAL SOURCE

    /**
     * The result id of the tokens.
     *
     * This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
    */
    readonly resultId: string | undefined;
    /**
     * The edits to the tokens data.
     * All edits refer to the initial data state.
    */
    readonly edits: SemanticTokensEdit[];

    /**
     * Create new semantic tokens edits.
     *
     * @param edits An array of semantic token edits
     * @param resultId Result identifier.
    */
    constructor(edits: SemanticTokensEdit[], resultId?: string);

    // ORIGINAL SOURCE
     **/
}
