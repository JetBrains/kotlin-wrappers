// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * A notebook cell kind.
 */
sealed /* enum */
external interface NotebookCellKind {
    companion object {
        /**
         * A markup-cell is formatted source that is used for display.
         */
        val Markup: NotebookCellKind // 1

        /**
         * A code-cell is source that can be {@link NotebookController executed} and that
         * produces {@link NotebookCellOutput output}.
         */
        val Code: NotebookCellKind // 2
    }
}
