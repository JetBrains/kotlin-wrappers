// Automatically generated - do not modify!

package vscode

/**
 * A provider that can contribute items to the status bar that appears below a cell's editor.
 */
external interface NotebookCellStatusBarItemProvider {
    /**
    // ORIGINAL SOURCE

    /**
     * An optional event to signal that statusbar items have changed. The provide method will be called again.
    */
    onDidChangeCellStatusBarItems?: Event<void>;

    /**
     * The provider will be called when the cell scrolls into view, when its content, outputs, language, or metadata change, and when it changes execution state.
     * @param cell The cell for which to return items.
     * @param token A token triggered if this request should be cancelled.
     * @returns One or more {@link NotebookCellStatusBarItem cell statusbar items}
    */
    provideCellStatusBarItems(cell: NotebookCell, token: CancellationToken): ProviderResult<NotebookCellStatusBarItem | NotebookCellStatusBarItem[]>;

    // ORIGINAL SOURCE
     **/
}
