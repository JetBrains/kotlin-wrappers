// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Provide inline value as text.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueText)
 */
open external class InlineValueText {
    /**
     * The document range for which the inline value applies.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueText.range)
     */
    val range: Range

    /**
     * The text of the inline value.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueText.text)
     */
    val text: String

    /**
     * Creates a new InlineValueText object.
     *
     * @param range The document line where to show the inline value.
     * @param text The value to be shown for the line.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueText.constructor)
     */
    constructor(
        range: Range,
        text: String,
    )
}
