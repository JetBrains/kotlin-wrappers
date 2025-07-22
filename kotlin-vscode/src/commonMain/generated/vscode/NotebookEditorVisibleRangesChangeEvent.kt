// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents an event describing the change in a {@link NotebookEditor.visibleRanges notebook editor's visibleRanges}.
 */
external interface NotebookEditorVisibleRangesChangeEvent {
    /**
     * The {@link NotebookEditor notebook editor} for which the visible ranges have changed.
     */
    val notebookEditor: NotebookEditor

    /**
     * The new value for the {@link NotebookEditor.visibleRanges notebook editor's visibleRanges}.
     */
    val visibleRanges: ReadonlyArray<NotebookRange>
}
