// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * A document highlight kind.
 */
sealed /* enum */
external interface DocumentHighlightKind {
    companion object {
        /**
         * A textual occurrence.
         */
        val Text: DocumentHighlightKind // 0

        /**
         * Read-access of a symbol, like reading a variable.
         */
        val Read: DocumentHighlightKind // 1

        /**
         * Write-access of a symbol, like writing to a variable.
         */
        val Write: DocumentHighlightKind // 2
    }
}
