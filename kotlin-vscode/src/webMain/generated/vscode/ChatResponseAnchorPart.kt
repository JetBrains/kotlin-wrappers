// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents a part of a chat response that is an anchor, that is rendered as a link to a target.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseAnchorPart)
 */
open external class ChatResponseAnchorPart {
    /**
     * The target of this anchor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseAnchorPart.value)
     */
    var value: JsAny /* Uri | Location */

    /**
     * An optional title that is rendered with value.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseAnchorPart.title)
     */
    var title: String?

    /**
     * Create a new ChatResponseAnchorPart.
     * @param value A uri or location.
     * @param title An optional title that is rendered with value.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseAnchorPart.constructor)
     */
    constructor(
        value: Uri,
        title: String = definedExternally,
    )

    constructor(
        value: Location,
        title: String = definedExternally,
    )
}
