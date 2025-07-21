// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

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
