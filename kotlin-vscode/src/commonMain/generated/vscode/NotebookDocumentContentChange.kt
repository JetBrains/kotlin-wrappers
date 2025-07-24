// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Describes a structural change to a notebook document, e.g newly added and removed cells.
 *
 * @see [NotebookDocumentChangeEvent]
 */
external interface NotebookDocumentContentChange {
    /**
     * The range at which cells have been either added or removed.
     *
     * Note that no cells have been [removed][NotebookDocumentContentChange.removedCells]
     * when this range is [empty][NotebookRange.isEmpty].
     */
    val range: NotebookRange

    /**
     * Cells that have been added to the document.
     */
    val addedCells: ReadonlyArray<NotebookCell>

    /**
     * Cells that have been removed from the document.
     */
    val removedCells: ReadonlyArray<NotebookCell>
}
