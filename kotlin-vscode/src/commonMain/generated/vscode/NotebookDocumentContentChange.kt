// Automatically generated - do not modify!

package vscode

/**
 * Describes a structural change to a notebook document, e.g newly added and removed cells.
 *
 * @see {@link NotebookDocumentChangeEvent}
 */
external interface NotebookDocumentContentChange {
    /**
    // ORIGINAL SOURCE


    /**
     * The range at which cells have been either added or removed.
     *
     * Note that no cells have been {@link NotebookDocumentContentChange.removedCells removed}
     * when this range is {@link NotebookRange.isEmpty empty}.
    */
    readonly range: NotebookRange;

    /**
     * Cells that have been added to the document.
    */
    readonly addedCells: readonly NotebookCell[];

    /**
     * Cells that have been removed from the document.
    */
    readonly removedCells: readonly NotebookCell[];

    // ORIGINAL SOURCE
     **/
}
