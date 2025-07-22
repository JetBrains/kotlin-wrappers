// Automatically generated - do not modify!

package vscode

/**
 * Represents a notebook editor that is attached to a {@link NotebookDocument notebook}.
 * Additional properties of the NotebookEditor are available in the proposed
 * API, which will be finalized later.
 */
external interface NotebookEditor {
    /**
    // ORIGINAL SOURCE


    /**
     * The {@link NotebookDocument notebook document} associated with this notebook editor.
    */
    readonly notebook: NotebookDocument;

    /**
     * The primary selection in this notebook editor.
    */
    selection: NotebookRange;

    /**
     * All selections in this notebook editor.
     *
     * The primary selection (or focused range) is `selections[0]`. When the document has no cells, the primary selection is empty `{ start: 0, end: 0 }`;
    */
    selections: readonly NotebookRange[];

    /**
     * The current visible ranges in the editor (vertically).
    */
    readonly visibleRanges: readonly NotebookRange[];

    /**
     * The column in which this editor shows.
    */
    readonly viewColumn?: ViewColumn;

    /**
     * Scroll as indicated by `revealType` in order to reveal the given range.
     *
     * @param range A range.
     * @param revealType The scrolling strategy for revealing `range`.
    */
    revealRange(range: NotebookRange, revealType?: NotebookEditorRevealType): void;

    // ORIGINAL SOURCE
     **/
}
