// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A file decoration represents metadata that can be rendered with a file.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileDecoration)
 */
open external class FileDecoration {
    /**
     * A very short string that represents this decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileDecoration.badge)
     */
    var badge: String?

    /**
     * A human-readable tooltip for this decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileDecoration.tooltip)
     */
    var tooltip: String?

    /**
     * The color of this decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileDecoration.color)
     */
    var color: ThemeColor?

    /**
     * A flag expressing that this decoration should be
     * propagated to its parents.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileDecoration.propagate)
     */
    var propagate: Boolean?

    /**
     * Creates a new decoration.
     *
     * @param badge A letter that represents the decoration.
     * @param tooltip The tooltip of the decoration.
     * @param color The color of the decoration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileDecoration.constructor)
     */
    constructor(
        badge: String = definedExternally,
        tooltip: String = definedExternally,
        color: ThemeColor = definedExternally,
    )
}
