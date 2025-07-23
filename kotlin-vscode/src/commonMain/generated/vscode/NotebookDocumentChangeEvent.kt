// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.Record

/**
 * An event describing a transactional {@link NotebookDocument notebook} change.
 */
external interface NotebookDocumentChangeEvent {
    /**
     * The affected notebook.
     */
    val notebook: NotebookDocument

    /**
     * The new metadata of the notebook or `undefined` when it did not change.
     */
    val metadata: Record<String, *>?

    /**
     * An array of content changes describing added or removed {@link NotebookCell cells}.
     */
    val contentChanges: ReadonlyArray<NotebookDocumentContentChange>

    /**
     * An array of {@link NotebookDocumentCellChange cell changes}.
     */
    val cellChanges: ReadonlyArray<NotebookDocumentCellChange>
}
