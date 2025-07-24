// Automatically generated - do not modify!

package vscode

/**
 * Represents an event describing the change of a [text editor's view column][TextEditor.viewColumn].
 */
external interface TextEditorViewColumnChangeEvent {
    /**
     * The [text editor][TextEditor] for which the view column has changed.
     */
    val textEditor: TextEditor

    /**
     * The new value for the [text editor's view column][TextEditor.viewColumn].
     */
    val viewColumn: ViewColumn
}
