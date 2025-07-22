// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents an event describing the change in a {@link NotebookEditor.selections notebook editor's selections}.
 */
external interface NotebookEditorSelectionChangeEvent {
    /**
     * The {@link NotebookEditor notebook editor} for which the selections have changed.
     */
    val notebookEditor: NotebookEditor

    /**
     * The new value for the {@link NotebookEditor.selections notebook editor's selections}.
     */
    val selections: ReadonlyArray<NotebookRange>
}
