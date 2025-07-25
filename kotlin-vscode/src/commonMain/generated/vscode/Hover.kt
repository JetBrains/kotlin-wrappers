// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A hover represents additional information for a symbol or word. Hovers are
 * rendered in a tooltip-like widget.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Hover)
 */
open external class Hover {
    /**
     * The contents of this hover.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Hover.contents)
     */
    var contents: ReadonlyArray<JsAny /* MarkdownString | MarkedString */>

    /**
     * The range to which this hover applies. When missing, the
     * editor will use the range at the current position or the
     * current position itself.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Hover.range)
     */
    var range: Range?

    /**
     * Creates a new hover object.
     *
     * @param contents The contents of the hover.
     * @param range The range to which the hover applies.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Hover.constructor)
     */
    constructor(
        contents: JsAny, /* MarkdownString | MarkedString | Array<MarkdownString | MarkedString> */
        range: Range = definedExternally,
    )
}
