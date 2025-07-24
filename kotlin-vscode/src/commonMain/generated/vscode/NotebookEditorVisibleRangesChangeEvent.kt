// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents an event describing the change in a [notebook editor's visibleRanges][NotebookEditor.visibleRanges].
 */
external interface NotebookEditorVisibleRangesChangeEvent {
    /**
     * The [notebook editor][NotebookEditor] for which the visible ranges have changed.
     */
    val notebookEditor: NotebookEditor

    /**
     * The new value for the [notebook editor's visibleRanges][NotebookEditor.visibleRanges].
     */
    val visibleRanges: ReadonlyArray<NotebookRange>
}
