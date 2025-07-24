// Automatically generated - do not modify!

package vscode

/**
 * Represents a handle to a set of decorations
 * sharing the same [styling options} in a {@link TextEditor text editor][DecorationRenderOptions].
 *
 * To get an instance of a `TextEditorDecorationType` use
 * [createTextEditorDecorationType][window.createTextEditorDecorationType].
 */
external interface TextEditorDecorationType :
    DisposableLike {
    /**
     * Internal representation of the handle.
     */
    val key: String

    /**
     * Remove this decoration type and all decorations on all text editors using it.
     */
    override fun dispose()
}
