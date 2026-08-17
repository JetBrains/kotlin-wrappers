// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents reasons why a text document is saved.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentSaveReason)
 */
/* enum */
external class TextDocumentSaveReason
private constructor() {

    /**
     * Manually triggered, e.g. by the user pressing save, by starting debugging,
     * or by an API call.
     */
    val Manual: TextDocumentSaveReason // 1

    /**
     * Automatic after a delay.
     */
    val AfterDelay: TextDocumentSaveReason // 2

    /**
     * When the editor lost focus.
     */
    val FocusOut: TextDocumentSaveReason // 3
}
