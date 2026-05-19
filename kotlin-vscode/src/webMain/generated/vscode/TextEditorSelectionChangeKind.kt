// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Represents sources that can cause [selection change events][window.onDidChangeTextEditorSelection].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorSelectionChangeKind)
 */
sealed /* enum */
external interface TextEditorSelectionChangeKind {
    companion object {
        /**
         * Selection changed due to typing in the editor.
         */
        val Keyboard: TextEditorSelectionChangeKind // 1

        /**
         * Selection change due to clicking in the editor.
         */
        val Mouse: TextEditorSelectionChangeKind // 2

        /**
         * Selection changed because a command ran.
         */
        val Command: TextEditorSelectionChangeKind // 3
    }
}
