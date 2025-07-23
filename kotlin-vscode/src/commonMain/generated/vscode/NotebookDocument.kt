// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.Record
import js.promise.PromiseLike

/**
 * Represents a notebook which itself is a sequence of {@link NotebookCell code or markup cells}. Notebook documents are
 * created from {@link NotebookData notebook data}.
 */
external interface NotebookDocument {
    /**
     * The associated uri for this notebook.
     *
     * *Note* that most notebooks use the `file`-scheme, which means they are files on disk. However, **not** all notebooks are
     * saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk.
     *
     * @see {@link FileSystemProvider}
     */
    val uri: Uri

    /**
     * The type of notebook.
     */
    val notebookType: String

    /**
     * The version number of this notebook (it will strictly increase after each
     * change, including undo/redo).
     */
    val version: Int

    /**
     * `true` if there are unpersisted changes.
     */
    val isDirty: Boolean

    /**
     * Is this notebook representing an untitled file which has not been saved yet.
     */
    val isUntitled: Boolean

    /**
     * `true` if the notebook has been closed. A closed notebook isn't synchronized anymore
     * and won't be re-used when the same resource is opened again.
     */
    val isClosed: Boolean

    /**
     * Arbitrary metadata for this notebook. Can be anything but must be JSON-stringifyable.
     */
    val metadata: Record<String, *>

    /**
     * The number of cells in the notebook.
     */
    val cellCount: Int

    /**
     * Return the cell at the specified index. The index will be adjusted to the notebook.
     *
     * @param index - The index of the cell to retrieve.
     * @returns A {@link NotebookCell cell}.
     */
    fun cellAt(index: Int): NotebookCell

    /**
     * Get the cells of this notebook. A subset can be retrieved by providing
     * a range. The range will be adjusted to the notebook.
     *
     * @param range A notebook range.
     * @returns The cells contained by the range or all cells.
     */
    fun getCells(range: NotebookRange = definedExternally): ReadonlyArray<NotebookCell>

    /**
     * Save the document. The saving will be handled by the corresponding {@link NotebookSerializer serializer}.
     *
     * @returns A promise that will resolve to true when the document
     * has been saved. Will return false if the file was not dirty or when save failed.
     */
    fun save(): PromiseLike<Boolean>
}
