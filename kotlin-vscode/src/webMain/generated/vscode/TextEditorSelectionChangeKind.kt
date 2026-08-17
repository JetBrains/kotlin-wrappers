// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents sources that can cause [selection change events][window.onDidChangeTextEditorSelection].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorSelectionChangeKind)
 */
/* enum */
external class TextEditorSelectionChangeKind
private constructor() {
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
