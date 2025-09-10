// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.objects.Record
import kotlin.js.JsModule
import kotlin.js.JsString

/**
 * A notebook edit represents edits that should be applied to the contents of a notebook.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEdit)
 */
open external class NotebookEdit {
    /**
     * Range of the cells being edited. May be empty.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEdit.range)
     */
    var range: NotebookRange

    /**
     * New cells being inserted. May be empty.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEdit.newCells)
     */
    var newCells: ReadonlyArray<NotebookCellData>

    /**
     * Optional new metadata for the cells.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEdit.newCellMetadata)
     */
    var newCellMetadata: Record<JsString, *>?

    /**
     * Optional new metadata for the notebook.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEdit.newNotebookMetadata)
     */
    var newNotebookMetadata: Record<JsString, *>?

    /**
     * Create a new notebook edit.
     *
     * @param range A notebook range.
     * @param newCells An array of new cell data.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEdit.constructor)
     */
    constructor(
        range: NotebookRange,
        newCells: ReadonlyArray<NotebookCellData>,
    )

    companion object {
        /**
         * Utility to create a edit that replaces cells in a notebook.
         *
         * @param range The range of cells to replace
         * @param newCells The new notebook cells.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEdit.replaceCells)
         */
        fun replaceCells(
            range: NotebookRange,
            newCells: ReadonlyArray<NotebookCellData>,
        ): NotebookEdit

        /**
         * Utility to create an edit that replaces cells in a notebook.
         *
         * @param index The index to insert cells at.
         * @param newCells The new notebook cells.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEdit.insertCells)
         */
        fun insertCells(
            index: Int,
            newCells: ReadonlyArray<NotebookCellData>,
        ): NotebookEdit

        /**
         * Utility to create an edit that deletes cells in a notebook.
         *
         * @param range The range of cells to delete.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEdit.deleteCells)
         */
        fun deleteCells(range: NotebookRange): NotebookEdit

        /**
         * Utility to create an edit that update a cell's metadata.
         *
         * @param index The index of the cell to update.
         * @param newCellMetadata The new metadata for the cell.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEdit.updateCellMetadata)
         */
        fun updateCellMetadata(
            index: Int,
            newCellMetadata: Record<JsString, *>,
        ): NotebookEdit

        /**
         * Utility to create an edit that updates the notebook's metadata.
         *
         * @param newNotebookMetadata The new metadata for the notebook.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEdit.updateNotebookMetadata)
         */
        fun updateNotebookMetadata(newNotebookMetadata: Record<JsString, *>): NotebookEdit
    }
}
