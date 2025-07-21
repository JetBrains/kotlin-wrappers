// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents sources that can cause {@link window.onDidChangeTextEditorSelection selection change events}.
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
