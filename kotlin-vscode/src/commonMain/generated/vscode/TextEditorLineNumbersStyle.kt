// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Rendering style of the line numbers.
 */
sealed /* enum */
external interface TextEditorLineNumbersStyle {
    companion object {
        /**
         * Do not render the line numbers.
         */
        val Off: TextEditorLineNumbersStyle // 0

        /**
         * Render the line numbers.
         */
        val On: TextEditorLineNumbersStyle // 1

        /**
         * Render the line numbers with values relative to the primary cursor location.
         */
        val Relative: TextEditorLineNumbersStyle // 2

        /**
         * Render the line numbers on every 10th line number.
         */
        val Interval: TextEditorLineNumbersStyle // 3
    }
}
