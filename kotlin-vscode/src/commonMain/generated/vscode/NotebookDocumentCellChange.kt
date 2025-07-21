// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Describes a change to a notebook cell.
 *
 * @see {@link NotebookDocumentChangeEvent}
*/
export interface NotebookDocumentCellChange {

/**
 * The affected cell.
*/
readonly cell: NotebookCell;

/**
 * The document of the cell or `undefined` when it did not change.
 *
 * *Note* that you should use the {@link workspace.onDidChangeTextDocument onDidChangeTextDocument}-event
 * for detailed change information, like what edits have been performed.
*/
readonly document: TextDocument | undefined;

/**
 * The new metadata of the cell or `undefined` when it did not change.
*/
readonly metadata: { [key: string]: any } | undefined;

/**
 * The new outputs of the cell or `undefined` when they did not change.
*/
readonly outputs: readonly NotebookCellOutput[] | undefined;

/**
 * The new execution summary of the cell or `undefined` when it did not change.
*/
readonly executionSummary: NotebookCellExecutionSummary | undefined;
}

// ORIGINAL SOURCE
 **/
