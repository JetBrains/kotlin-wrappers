// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.ReadonlyRecord

/**
 * Represents a cell of a [notebook}, either a {@link NotebookCellKind.Code code][NotebookDocument]-cell
 * or [markup][NotebookCellKind.Markup]-cell.
 *
 * NotebookCell instances are immutable and are kept in sync for as long as they are part of their notebook.
 */
external interface NotebookCell {
    /**
     * The index of this cell in its [containing notebook][NotebookDocument.cellAt]. The
     * index is updated when a cell is moved within its notebook. The index is `-1`
     * when the cell has been removed from its notebook.
     */
    val index: Int

    /**
     * The [notebook][NotebookDocument] that contains this cell.
     */
    val notebook: NotebookDocument

    /**
     * The kind of this cell.
     */
    val kind: NotebookCellKind

    /**
     * The [text][TextDocument] of this cell, represented as text document.
     */
    val document: TextDocument

    /**
     * The metadata of this cell. Can be anything but must be JSON-stringifyable.
     */
    val metadata: ReadonlyRecord<JsString, *>

    /**
     * The outputs of this cell.
     */
    val outputs: ReadonlyArray<NotebookCellOutput>

    /**
     * The most recent [execution summary][NotebookCellExecutionSummary] for this cell.
     */
    val executionSummary: NotebookCellExecutionSummary?
}
