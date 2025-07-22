// Automatically generated - do not modify!

package vscode

/**
 * An event describing a transactional {@link NotebookDocument notebook} change.
 */
external interface NotebookDocumentChangeEvent {
    /**
     * The affected notebook.
     */
//  readonly notebook: NotebookDocument;

    /**
     * The new metadata of the notebook or `undefined` when it did not change.
     */
//  readonly metadata: { [key: string]: any } | undefined;

    /**
     * An array of content changes describing added or removed {@link NotebookCell cells}.
     */
//  readonly contentChanges: readonly NotebookDocumentContentChange[];

    /**
     * An array of {@link NotebookDocumentCellChange cell changes}.
     */
//  readonly cellChanges: readonly NotebookDocumentCellChange[];
}
