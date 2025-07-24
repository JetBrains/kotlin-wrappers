// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.Record

/**
 * A notebook edit represents edits that should be applied to the contents of a notebook.
 */
open external class NotebookEdit {
    /**
     * Range of the cells being edited. May be empty.
     */
    var range: NotebookRange

    /**
     * New cells being inserted. May be empty.
     */
    var newCells: ReadonlyArray<NotebookCellData>

    /**
     * Optional new metadata for the cells.
     */
    var newCellMetadata: Record<JsString, *>?

    /**
     * Optional new metadata for the notebook.
     */
    var newNotebookMetadata: Record<JsString, *>?

    /**
     * Create a new notebook edit.
     *
     * @param range A notebook range.
     * @param newCells An array of new cell data.
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
         */
        fun insertCells(
            index: Int,
            newCells: ReadonlyArray<NotebookCellData>,
        ): NotebookEdit

        /**
         * Utility to create an edit that deletes cells in a notebook.
         *
         * @param range The range of cells to delete.
         */
        fun deleteCells(range: NotebookRange): NotebookEdit

        /**
         * Utility to create an edit that update a cell's metadata.
         *
         * @param index The index of the cell to update.
         * @param newCellMetadata The new metadata for the cell.
         */
        fun updateCellMetadata(
            index: Int,
            newCellMetadata: Record<JsString, *>,
        ): NotebookEdit

        /**
         * Utility to create an edit that updates the notebook's metadata.
         *
         * @param newNotebookMetadata The new metadata for the notebook.
         */
        fun updateNotebookMetadata(newNotebookMetadata: Record<JsString, *>): NotebookEdit
    }
}
