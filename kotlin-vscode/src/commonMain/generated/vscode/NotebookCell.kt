// Automatically generated - do not modify!

package vscode

/**
 * Represents a cell of a {@link NotebookDocument notebook}, either a {@link NotebookCellKind.Code code}-cell
 * or {@link NotebookCellKind.Markup markup}-cell.
 *
 * NotebookCell instances are immutable and are kept in sync for as long as they are part of their notebook.
 */
external interface NotebookCell {
    /**
    // ORIGINAL SOURCE


    /**
     * The index of this cell in its {@link NotebookDocument.cellAt containing notebook}. The
     * index is updated when a cell is moved within its notebook. The index is `-1`
     * when the cell has been removed from its notebook.
    */
    readonly index: number;

    /**
     * The {@link NotebookDocument notebook} that contains this cell.
    */
    readonly notebook: NotebookDocument;

    /**
     * The kind of this cell.
    */
    readonly kind: NotebookCellKind;

    /**
     * The {@link TextDocument text} of this cell, represented as text document.
    */
    readonly document: TextDocument;

    /**
     * The metadata of this cell. Can be anything but must be JSON-stringifyable.
    */
    readonly metadata: { readonly [key: string]: any };

    /**
     * The outputs of this cell.
    */
    readonly outputs: readonly NotebookCellOutput[];

    /**
     * The most recent {@link NotebookCellExecutionSummary execution summary} for this cell.
    */
    readonly executionSummary: NotebookCellExecutionSummary | undefined;

    // ORIGINAL SOURCE
     **/
}
