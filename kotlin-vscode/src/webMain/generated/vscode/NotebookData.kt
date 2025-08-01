// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.Record
import kotlin.js.JsModule

/**
 * Raw representation of a notebook.
 *
 * Extensions are responsible for creating {@linkcode NotebookData} so that the editor
 * can create a {@linkcode NotebookDocument}.
 *
 * @see [NotebookSerializer]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookData)
 */
open external class NotebookData {
    /**
     * The cell data of this notebook data.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookData.cells)
     */
    var cells: ReadonlyArray<NotebookCellData>

    /**
     * Arbitrary metadata of notebook data.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookData.metadata)
     */
    var metadata: Record<JsString, *>?

    /**
     * Create new notebook data.
     *
     * @param cells An array of cell data.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookData.constructor)
     */
    constructor(cells: ReadonlyArray<NotebookCellData>)
}
