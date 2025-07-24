// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A file decoration represents metadata that can be rendered with a file.
 */
open external class FileDecoration {
    /**
     * A very short string that represents this decoration.
     */
    var badge: String?

    /**
     * A human-readable tooltip for this decoration.
     */
    var tooltip: String?

    /**
     * The color of this decoration.
     */
    var color: ThemeColor?

    /**
     * A flag expressing that this decoration should be
     * propagated to its parents.
     */
    var propagate: Boolean?

    /**
     * Creates a new decoration.
     *
     * @param badge A letter that represents the decoration.
     * @param tooltip The tooltip of the decoration.
     * @param color The color of the decoration.
     */
    constructor(
        badge: String = definedExternally,
        tooltip: String = definedExternally,
        color: ThemeColor = definedExternally,
    )
}
