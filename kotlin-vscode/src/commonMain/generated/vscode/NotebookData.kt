// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.objects.Record

/**
 * Raw representation of a notebook.
 *
 * Extensions are responsible for creating {@linkcode NotebookData} so that the editor
 * can create a {@linkcode NotebookDocument}.
 *
 * @see {@link NotebookSerializer}
 */
open external class NotebookData {
    /**
     * The cell data of this notebook data.
     */
    var cells: ReadonlyArray<NotebookCellData>

    /**
     * Arbitrary metadata of notebook data.
     */
    var metadata: Record<String, *>?

    /**
     * Create new notebook data.
     *
     * @param cells An array of cell data.
     */
//  constructor(cells: NotebookCellData[])
}
