// Automatically generated - do not modify!

package vscode

/**
 * Represents an event describing the change in a [text editor's options][TextEditor.options].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorOptionsChangeEvent)
 */
external interface TextEditorOptionsChangeEvent {
    /**
     * The [text editor][TextEditor] for which the options have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorOptionsChangeEvent.textEditor)
     */
    val textEditor: TextEditor

    /**
     * The new value for the [text editor's options][TextEditor.options].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorOptionsChangeEvent.options)
     */
    val options: TextEditorOptions
}
