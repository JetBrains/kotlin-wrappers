// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.typedarrays.Uint32Array
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents an edit to semantic tokens.
 * @see [provideDocumentSemanticTokensEdits][DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits] for an explanation of the format.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensEdit)
 */
open external class SemanticTokensEdit {
    /**
     * The start offset of the edit.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensEdit.start)
     */
    val start: Int

    /**
     * The count of elements to remove.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensEdit.deleteCount)
     */
    val deleteCount: Int

    /**
     * The elements to insert.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensEdit.data)
     */
    val data: Uint32Array<*>?

    /**
     * Create a semantic token edit.
     *
     * @param start Start offset
     * @param deleteCount Number of elements to remove.
     * @param data Elements to insert
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensEdit.constructor)
     */
    constructor(
        start: Int,
        deleteCount: Int,
        data: Uint32Array<*> = definedExternally,
    )
}
