// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * Describes a structural change to a notebook document, e.g newly added and removed cells.
 *
 * @see [NotebookDocumentChangeEvent]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentContentChange)
 */
@JsPlainObject
external interface NotebookDocumentContentChange {
    /**
     * The range at which cells have been either added or removed.
     *
     * Note that no cells have been [removed][NotebookDocumentContentChange.removedCells]
     * when this range is [empty][NotebookRange.isEmpty].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentContentChange.range)
     */
    val range: NotebookRange

    /**
     * Cells that have been added to the document.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentContentChange.addedCells)
     */
    val addedCells: ReadonlyArray<NotebookCell>

    /**
     * Cells that have been removed from the document.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentContentChange.removedCells)
     */
    val removedCells: ReadonlyArray<NotebookCell>
}
