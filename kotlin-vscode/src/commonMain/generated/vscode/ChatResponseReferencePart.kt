// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny

/**
 * Represents a part of a chat response that is a reference, rendered separately from the content.
 */
open external class ChatResponseReferencePart {
    /**
     * The reference target.
     */
    var value: JsAny /* Uri | Location */

    /**
     * The icon for the reference.
     */
    var iconPath: IconPath?

    /**
     * Create a new ChatResponseReferencePart.
     * @param value A uri or location
     * @param iconPath Icon for the reference shown in UI
     */
    constructor(
        value: JsAny, /* Uri | Location */
        iconPath: IconPath = definedExternally,
    )
}
