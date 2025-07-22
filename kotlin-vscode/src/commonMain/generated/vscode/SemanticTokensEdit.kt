// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.typedarrays.Uint32Array

/**
 * Represents an edit to semantic tokens.
 * @see {@link DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits provideDocumentSemanticTokensEdits} for an explanation of the format.
 */
open external class SemanticTokensEdit {
    /**
     * The start offset of the edit.
     */
    val start: Int

    /**
     * The count of elements to remove.
     */
    val deleteCount: Int

    /**
     * The elements to insert.
     */
    val data: Uint32Array<*>

    /**
     * Create a semantic token edit.
     *
     * @param start Start offset
     * @param deleteCount Number of elements to remove.
     * @param data Elements to insert
     */
    constructor(
        start: Int,
        deleteCount: Int,
        data: Uint32Array<*> = definedExternally,
    )
}
