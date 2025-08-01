// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A selection range represents a part of a selection hierarchy. A selection range
 * may have a parent selection range that contains it.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SelectionRange)
 */
open external class SelectionRange {
    /**
     * The [Range] of this selection range.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SelectionRange.range)
     */
    var range: Range

    /**
     * The parent selection range containing this range.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SelectionRange.parent)
     */
    var parent: SelectionRange?

    /**
     * Creates a new selection range.
     *
     * @param range The range of the selection range.
     * @param parent The parent of the selection range.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SelectionRange.constructor)
     */
    constructor(
        range: Range,
        parent: SelectionRange = definedExternally,
    )
}
