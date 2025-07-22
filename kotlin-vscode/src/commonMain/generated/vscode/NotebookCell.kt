// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord

/**
 * Represents a cell of a {@link NotebookDocument notebook}, either a {@link NotebookCellKind.Code code}-cell
 * or {@link NotebookCellKind.Markup markup}-cell.
 *
 * NotebookCell instances are immutable and are kept in sync for as long as they are part of their notebook.
 */
external interface NotebookCell {
    /**
     * The index of this cell in its {@link NotebookDocument.cellAt containing notebook}. The
     * index is updated when a cell is moved within its notebook. The index is `-1`
     * when the cell has been removed from its notebook.
     */
    val index: Int

    /**
     * The {@link NotebookDocument notebook} that contains this cell.
     */
    val notebook: NotebookDocument

    /**
     * The kind of this cell.
     */
    val kind: NotebookCellKind

    /**
     * The {@link TextDocument text} of this cell, represented as text document.
     */
    val document: TextDocument

    /**
     * The metadata of this cell. Can be anything but must be JSON-stringifyable.
     */
    val metadata: ReadonlyRecord<String, *>

    /**
     * The outputs of this cell.
     */
    val outputs: ReadonlyArray<NotebookCellOutput>

    /**
     * The most recent {@link NotebookCellExecutionSummary execution summary} for this cell.
     */
    val executionSummary: NotebookCellExecutionSummary
}
