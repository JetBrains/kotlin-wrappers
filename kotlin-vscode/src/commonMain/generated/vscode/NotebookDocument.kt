// Automatically generated - do not modify!

package vscode

/**
 * Represents a notebook which itself is a sequence of {@link NotebookCell code or markup cells}. Notebook documents are
 * created from {@link NotebookData notebook data}.
 */
external interface NotebookDocument {
    /**
    // ORIGINAL SOURCE


    /**
     * The associated uri for this notebook.
     *
     * *Note* that most notebooks use the `file`-scheme, which means they are files on disk. However, **not** all notebooks are
     * saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk.
     *
     * @see {@link FileSystemProvider}
    */
    readonly uri: Uri;

    /**
     * The type of notebook.
    */
    readonly notebookType: string;

    /**
     * The version number of this notebook (it will strictly increase after each
     * change, including undo/redo).
    */
    readonly version: number;

    /**
     * `true` if there are unpersisted changes.
    */
    readonly isDirty: boolean;

    /**
     * Is this notebook representing an untitled file which has not been saved yet.
    */
    readonly isUntitled: boolean;

    /**
     * `true` if the notebook has been closed. A closed notebook isn't synchronized anymore
     * and won't be re-used when the same resource is opened again.
    */
    readonly isClosed: boolean;

    /**
     * Arbitrary metadata for this notebook. Can be anything but must be JSON-stringifyable.
    */
    readonly metadata: { [key: string]: any };

    /**
     * The number of cells in the notebook.
    */
    readonly cellCount: number;

    /**
     * Return the cell at the specified index. The index will be adjusted to the notebook.
     *
     * @param index - The index of the cell to retrieve.
     * @returns A {@link NotebookCell cell}.
    */
    cellAt(index: number): NotebookCell;

    /**
     * Get the cells of this notebook. A subset can be retrieved by providing
     * a range. The range will be adjusted to the notebook.
     *
     * @param range A notebook range.
     * @returns The cells contained by the range or all cells.
    */
    getCells(range?: NotebookRange): NotebookCell[];

    /**
     * Save the document. The saving will be handled by the corresponding {@link NotebookSerializer serializer}.
     *
     * @returns A promise that will resolve to true when the document
     * has been saved. Will return false if the file was not dirty or when save failed.
    */
    save(): Thenable<boolean>;

    // ORIGINAL SOURCE
     **/
}
