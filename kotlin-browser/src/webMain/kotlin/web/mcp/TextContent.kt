package web.mcp

import kotlinx.js.JsPlainObject

/**
 * Plain text content.
 */
@JsPlainObject
external interface TextContent :
    ContentBlock {
    /**
     * Discriminator for text content.
     */
    override var type: String /* 'text' */

    /**
     * UTF-8 text value.
     */
    var text: String
}
