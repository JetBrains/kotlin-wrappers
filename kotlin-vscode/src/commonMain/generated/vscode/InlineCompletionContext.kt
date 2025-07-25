// Automatically generated - do not modify!

package vscode

/**
 * Provides information about the context in which an inline completion was requested.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionContext)
 */
external interface InlineCompletionContext {
    /**
     * Describes how the inline completion was triggered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionContext.triggerKind)
     */
    val triggerKind: InlineCompletionTriggerKind

    /**
     * Provides information about the currently selected item in the autocomplete widget if it is visible.
     *
     * If set, provided inline completions must extend the text of the selected item
     * and use the same range, otherwise they are not shown as preview.
     * As an example, if the document text is `console.` and the selected item is `.log` replacing the `.` in the document,
     * the inline completion must also replace `.` and start with `.log`, for example `.log()`.
     *
     * Inline completion providers are requested again whenever the selected item changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionContext.selectedCompletionInfo)
     */
    val selectedCompletionInfo: SelectedCompletionInfo?
}
