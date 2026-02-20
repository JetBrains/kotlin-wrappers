package web.mcp

import kotlinx.js.JsPlainObject

/**
 * Base64-encoded image content.
 */
@JsPlainObject
external interface ImageContent :
    ContentBlock {
    /**
     * Discriminator for image content.
     */
    override var type: String /* 'image' */

    /**
     * Base64 payload.
     */
    var data: String

    /**
     * MIME type for the encoded image.
     */
    var mimeType: String
}
