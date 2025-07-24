// Automatically generated - do not modify!

package vscode

/**
 * Represents an event describing the change in a [text editor's options][TextEditor.options].
 */
external interface TextEditorOptionsChangeEvent {
    /**
     * The [text editor][TextEditor] for which the options have changed.
     */
    val textEditor: TextEditor

    /**
     * The new value for the [text editor's options][TextEditor.options].
     */
    val options: TextEditorOptions
}
