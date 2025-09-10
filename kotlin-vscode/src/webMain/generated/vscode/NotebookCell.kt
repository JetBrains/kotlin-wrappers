// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import kotlin.js.JsString

/**
 * Represents a cell of a [notebook}, either a {@link NotebookCellKind.Code code][NotebookDocument]-cell
 * or [markup][NotebookCellKind.Markup]-cell.
 *
 * NotebookCell instances are immutable and are kept in sync for as long as they are part of their notebook.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCell)
 */
@JsPlainObject
external interface NotebookCell {
    /**
     * The index of this cell in its [containing notebook][NotebookDocument.cellAt]. The
     * index is updated when a cell is moved within its notebook. The index is `-1`
     * when the cell has been removed from its notebook.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCell.index)
     */
    val index: Int

    /**
     * The [notebook][NotebookDocument] that contains this cell.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCell.notebook)
     */
    val notebook: NotebookDocument

    /**
     * The kind of this cell.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCell.kind)
     */
    val kind: NotebookCellKind

    /**
     * The [text][TextDocument] of this cell, represented as text document.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCell.document)
     */
    val document: TextDocument

    /**
     * The metadata of this cell. Can be anything but must be JSON-stringifyable.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCell.metadata)
     */
    val metadata: ReadonlyRecord<JsString, *>

    /**
     * The outputs of this cell.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCell.outputs)
     */
    val outputs: ReadonlyArray<NotebookCellOutput>

    /**
     * The most recent [execution summary][NotebookCellExecutionSummary] for this cell.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCell.executionSummary)
     */
    val executionSummary: NotebookCellExecutionSummary?
}
