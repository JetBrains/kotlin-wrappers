// Automatically generated - do not modify!

package vscode

/**
 * Describes the currently selected completion item.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SelectedCompletionInfo)
 */
external interface SelectedCompletionInfo {
    /**
     * The range that will be replaced if this completion item is accepted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SelectedCompletionInfo.range)
     */
    val range: Range

    /**
     * The text the range will be replaced with if this completion is accepted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SelectedCompletionInfo.text)
     */
    val text: String
}
