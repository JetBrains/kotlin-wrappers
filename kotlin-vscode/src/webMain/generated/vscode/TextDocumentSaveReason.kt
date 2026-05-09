// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Represents reasons why a text document is saved.
 */
sealed /* enum */
external interface TextDocumentSaveReason {
    companion object {
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
}
