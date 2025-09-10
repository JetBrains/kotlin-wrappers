// Automatically generated - do not modify!

package vscode

import js.core.Void
import kotlin.js.JsAny

/**
 * A provider that can contribute items to the status bar that appears below a cell's editor.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellStatusBarItemProvider)
 */
external interface NotebookCellStatusBarItemProvider {
    /**
     * An optional event to signal that statusbar items have changed. The provide method will be called again.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellStatusBarItemProvider.onDidChangeCellStatusBarItems)
     */
    var onDidChangeCellStatusBarItems: Event<Void>?

    /**
     * The provider will be called when the cell scrolls into view, when its content, outputs, language, or metadata change, and when it changes execution state.
     * @param cell The cell for which to return items.
     * @param token A token triggered if this request should be cancelled.
     * @returns One or more [cell statusbar items][NotebookCellStatusBarItem]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellStatusBarItemProvider.provideCellStatusBarItems)
     */
    fun provideCellStatusBarItems(
        cell: NotebookCell,
        token: CancellationToken,
    ): ProviderResult<JsAny /* NotebookCellStatusBarItem | NotebookCellStatusBarItem[] */>
}
