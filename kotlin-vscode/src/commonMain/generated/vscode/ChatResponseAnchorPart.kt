// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a part of a chat response that is an anchor, that is rendered as a link to a target.
 */
open external class ChatResponseAnchorPart {
    /**
     * The target of this anchor.
     */
    var value: Any /* Uri | Location */

    /**
     * An optional title that is rendered with value.
     */
    var title: String?

    /**
     * Create a new ChatResponseAnchorPart.
     * @param value A uri or location.
     * @param title An optional title that is rendered with value.
     */
    constructor(
        value: Any, /* Uri | Location */
        title: String = definedExternally,
    )
}
