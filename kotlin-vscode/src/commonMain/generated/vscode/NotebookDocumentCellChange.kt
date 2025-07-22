// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.Record

/**
 * Describes a change to a notebook cell.
 *
 * @see {@link NotebookDocumentChangeEvent}
 */
external interface NotebookDocumentCellChange {
    /**
     * The affected cell.
     */
    val cell: NotebookCell

    /**
     * The document of the cell or `undefined` when it did not change.
     *
     * *Note* that you should use the {@link workspace.onDidChangeTextDocument onDidChangeTextDocument}-event
     * for detailed change information, like what edits have been performed.
     */
    val document: TextDocument

    /**
     * The new metadata of the cell or `undefined` when it did not change.
     */
    val metadata: Record<String, *>

    /**
     * The new outputs of the cell or `undefined` when they did not change.
     */
    val outputs: ReadonlyArray<NotebookCellOutput>

    /**
     * The new execution summary of the cell or `undefined` when it did not change.
     */
    val executionSummary: NotebookCellExecutionSummary
}
