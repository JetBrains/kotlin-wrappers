// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import kotlin.js.JsString

/**
 * An event describing a transactional [notebook][NotebookDocument] change.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentChangeEvent)
 */
@JsPlainObject
external interface NotebookDocumentChangeEvent {
    /**
     * The affected notebook.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentChangeEvent.notebook)
     */
    val notebook: NotebookDocument

    /**
     * The new metadata of the notebook or `undefined` when it did not change.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentChangeEvent.metadata)
     */
    val metadata: ReadonlyRecord<JsString, *>?

    /**
     * An array of content changes describing added or removed [cells][NotebookCell].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentChangeEvent.contentChanges)
     */
    val contentChanges: ReadonlyArray<NotebookDocumentContentChange>

    /**
     * An array of [cell changes][NotebookDocumentCellChange].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentChangeEvent.cellChanges)
     */
    val cellChanges: ReadonlyArray<NotebookDocumentCellChange>
}
