// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents an event describing the change in a [notebook editor's selections][NotebookEditor.selections].
 */
external interface NotebookEditorSelectionChangeEvent {
    /**
     * The [notebook editor][NotebookEditor] for which the selections have changed.
     */
    val notebookEditor: NotebookEditor

    /**
     * The new value for the [notebook editor's selections][NotebookEditor.selections].
     */
    val selections: ReadonlyArray<NotebookRange>
}
