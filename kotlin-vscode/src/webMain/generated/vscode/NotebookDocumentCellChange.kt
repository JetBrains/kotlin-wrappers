// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.Record
import kotlin.js.JsString

/**
 * Describes a change to a notebook cell.
 *
 * @see [NotebookDocumentChangeEvent]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentCellChange)
 */
@JsPlainObject
external interface NotebookDocumentCellChange {
    /**
     * The affected cell.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentCellChange.cell)
     */
    val cell: NotebookCell

    /**
     * The document of the cell or `undefined` when it did not change.
     *
     * *Note* that you should use the [onDidChangeTextDocument][workspace.onDidChangeTextDocument]-event
     * for detailed change information, like what edits have been performed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentCellChange.document)
     */
    val document: TextDocument?

    /**
     * The new metadata of the cell or `undefined` when it did not change.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentCellChange.metadata)
     */
    val metadata: Record<JsString, *>?

    /**
     * The new outputs of the cell or `undefined` when they did not change.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentCellChange.outputs)
     */
    val outputs: ReadonlyArray<NotebookCellOutput>?

    /**
     * The new execution summary of the cell or `undefined` when it did not change.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentCellChange.executionSummary)
     */
    val executionSummary: NotebookCellExecutionSummary?
}
