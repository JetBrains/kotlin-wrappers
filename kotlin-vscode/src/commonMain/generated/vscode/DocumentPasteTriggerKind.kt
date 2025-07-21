// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * The reason why paste edits were requested.
 */
sealed /* enum */
external interface DocumentPasteTriggerKind {
    companion object {
        /**
         * Pasting was requested as part of a normal paste operation.
         */
        val Automatic: DocumentPasteTriggerKind // 0

        /**
         * Pasting was requested by the user with the `paste as` command.
         */
        val PasteAs: DocumentPasteTriggerKind // 1
    }
}
