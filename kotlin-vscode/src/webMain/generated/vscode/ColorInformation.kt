// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Represents a color range from a document.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ColorInformation)
 */
open external class ColorInformation {
    /**
     * The range in the document where this color appears.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ColorInformation.range)
     */
    var range: Range

    /**
     * The actual color value for this color range.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ColorInformation.color)
     */
    var color: Color

    /**
     * Creates a new color range.
     *
     * @param range The range the color appears in. Must not be empty.
     * @param color The value of the color.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ColorInformation.constructor)
     */
    constructor(
        range: Range,
        color: Color,
    )
}
