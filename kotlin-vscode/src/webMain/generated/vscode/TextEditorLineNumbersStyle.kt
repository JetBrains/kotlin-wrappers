// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Rendering style of the line numbers.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextEditorLineNumbersStyle)
 */
/* enum */
external class TextEditorLineNumbersStyle
private constructor() {
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
