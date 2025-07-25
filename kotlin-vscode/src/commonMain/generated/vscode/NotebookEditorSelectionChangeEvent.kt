// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject

/**
 * Represents an event describing the change in a [notebook editor's selections][NotebookEditor.selections].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditorSelectionChangeEvent)
 */
@JsPlainObject
external interface NotebookEditorSelectionChangeEvent {
    /**
     * The [notebook editor][NotebookEditor] for which the selections have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditorSelectionChangeEvent.notebookEditor)
     */
    val notebookEditor: NotebookEditor

    /**
     * The new value for the [notebook editor's selections][NotebookEditor.selections].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditorSelectionChangeEvent.selections)
     */
    val selections: ReadonlyArray<NotebookRange>
}
