// Automatically generated - do not modify!

package vscode

/**
 * Represents a handle to a set of decorations
 * sharing the same [styling options} in a {@link TextEditor text editor][DecorationRenderOptions].
 *
 * To get an instance of a `TextEditorDecorationType` use
 * [createTextEditorDecorationType][window.createTextEditorDecorationType].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorDecorationType)
 */
external interface TextEditorDecorationType :
    DisposableLike {
    /**
     * Internal representation of the handle.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorDecorationType.key)
     */
    val key: String

    /**
     * Remove this decoration type and all decorations on all text editors using it.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorDecorationType.dispose)
     */
    override fun dispose()
}
