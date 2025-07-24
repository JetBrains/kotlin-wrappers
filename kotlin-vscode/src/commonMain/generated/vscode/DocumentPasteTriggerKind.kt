// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

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
