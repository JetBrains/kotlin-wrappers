// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject

/**
 * Represents an event describing the change in a [notebook editor's visibleRanges][NotebookEditor.visibleRanges].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditorVisibleRangesChangeEvent)
 */
@JsPlainObject
external interface NotebookEditorVisibleRangesChangeEvent {
    /**
     * The [notebook editor][NotebookEditor] for which the visible ranges have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditorVisibleRangesChangeEvent.notebookEditor)
     */
    val notebookEditor: NotebookEditor

    /**
     * The new value for the [notebook editor's visibleRanges][NotebookEditor.visibleRanges].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditorVisibleRangesChangeEvent.visibleRanges)
     */
    val visibleRanges: ReadonlyArray<NotebookRange>
}
