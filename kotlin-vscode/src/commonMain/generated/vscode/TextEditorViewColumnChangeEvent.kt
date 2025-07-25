// Automatically generated - do not modify!

package vscode

/**
 * Represents an event describing the change of a [text editor's view column][TextEditor.viewColumn].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorViewColumnChangeEvent)
 */
external interface TextEditorViewColumnChangeEvent {
    /**
     * The [text editor][TextEditor] for which the view column has changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorViewColumnChangeEvent.textEditor)
     */
    val textEditor: TextEditor

    /**
     * The new value for the [text editor's view column][TextEditor.viewColumn].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorViewColumnChangeEvent.viewColumn)
     */
    val viewColumn: ViewColumn
}
