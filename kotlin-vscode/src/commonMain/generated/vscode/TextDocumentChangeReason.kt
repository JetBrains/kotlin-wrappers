// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Reasons for why a text document has changed.
 */
sealed /* enum */
external interface TextDocumentChangeReason {
    companion object {
        /** The text change is caused by an undo operation. */
        val Undo: TextDocumentChangeReason // 1

        /** The text change is caused by an redo operation. */
        val Redo: TextDocumentChangeReason // 2
    }
}
