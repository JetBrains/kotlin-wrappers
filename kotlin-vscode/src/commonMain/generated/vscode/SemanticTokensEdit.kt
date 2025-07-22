// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents an edit to semantic tokens.
 * @see {@link DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits provideDocumentSemanticTokensEdits} for an explanation of the format.
 */
open external class SemanticTokensEdit {
    /**
    // ORIGINAL SOURCE

    /**
     * The start offset of the edit.
    */
    readonly start: number;
    /**
     * The count of elements to remove.
    */
    readonly deleteCount: number;
    /**
     * The elements to insert.
    */
    readonly data: Uint32Array | undefined;

    /**
     * Create a semantic token edit.
     *
     * @param start Start offset
     * @param deleteCount Number of elements to remove.
     * @param data Elements to insert
    */
    constructor(start: number, deleteCount: number, data?: Uint32Array);

    // ORIGINAL SOURCE
     **/
}
