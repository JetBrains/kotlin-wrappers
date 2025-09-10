// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsBoolean
import js.objects.Record
import js.promise.PromiseLike
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * Represents a notebook which itself is a sequence of [code or markup cells][NotebookCell]. Notebook documents are
 * created from [notebook data][NotebookData].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument)
 */
external interface NotebookDocument {
    /**
     * The associated uri for this notebook.
     *
     * *Note* that most notebooks use the `file`-scheme, which means they are files on disk. However, **not** all notebooks are
     * saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk.
     *
     * @see [FileSystemProvider]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument.uri)
     */
    val uri: Uri

    /**
     * The type of notebook.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument.notebookType)
     */
    val notebookType: String

    /**
     * The version number of this notebook (it will strictly increase after each
     * change, including undo/redo).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument.version)
     */
    val version: Int

    /**
     * `true` if there are unpersisted changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument.isDirty)
     */
    val isDirty: Boolean

    /**
     * Is this notebook representing an untitled file which has not been saved yet.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument.isUntitled)
     */
    val isUntitled: Boolean

    /**
     * `true` if the notebook has been closed. A closed notebook isn't synchronized anymore
     * and won't be re-used when the same resource is opened again.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument.isClosed)
     */
    val isClosed: Boolean

    /**
     * Arbitrary metadata for this notebook. Can be anything but must be JSON-stringifyable.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument.metadata)
     */
    val metadata: Record<JsString, *>

    /**
     * The number of cells in the notebook.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument.cellCount)
     */
    val cellCount: Int

    /**
     * Return the cell at the specified index. The index will be adjusted to the notebook.
     *
     * @param index - The index of the cell to retrieve.
     * @returns A [cell][NotebookCell].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument.cellAt)
     */
    fun cellAt(index: Int): NotebookCell

    /**
     * Get the cells of this notebook. A subset can be retrieved by providing
     * a range. The range will be adjusted to the notebook.
     *
     * @param range A notebook range.
     * @returns The cells contained by the range or all cells.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument.getCells)
     */
    fun getCells(range: NotebookRange = definedExternally): ReadonlyArray<NotebookCell>

    /**
     * Save the document. The saving will be handled by the corresponding [serializer][NotebookSerializer].
     *
     * @returns A promise that will resolve to true when the document
     * has been saved. Will return false if the file was not dirty or when save failed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocument.save)
     */
    fun save(): PromiseLike<JsBoolean>
}
