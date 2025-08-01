// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Represents a color in RGBA space.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Color)
 */
open external class Color {
    /**
     * The red component of this color in the range `[0-1]`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Color.red)
     */
    val red: Double

    /**
     * The green component of this color in the range `[0-1]`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Color.green)
     */
    val green: Double

    /**
     * The blue component of this color in the range `[0-1]`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Color.blue)
     */
    val blue: Double

    /**
     * The alpha component of this color in the range `[0-1]`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Color.alpha)
     */
    val alpha: Double

    /**
     * Creates a new color instance.
     *
     * @param red The red component.
     * @param green The green component.
     * @param blue The blue component.
     * @param alpha The alpha component.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Color.constructor)
     */
    constructor(
        red: Double,
        green: Double,
        blue: Double,
        alpha: Double,
    )
}
