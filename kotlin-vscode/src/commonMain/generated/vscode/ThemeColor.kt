// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * A reference to one of the workbench colors as defined in https://code.visualstudio.com/api/references/theme-color.
 * Using a theme color is preferred over a custom color as it gives theme authors and users the possibility to change the color.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemeColor)
 */
open external class ThemeColor {
    /**
     * The id of this color.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemeColor.id)
     */
    val id: String

    /**
     * Creates a reference to a theme color.
     * @param id of the color. The available colors are listed in https://code.visualstudio.com/api/references/theme-color.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemeColor.constructor)
     */
    constructor(id: String)
}
