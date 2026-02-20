package web.mcp

import kotlinx.js.JsPlainObject

/**
 * Base64-encoded audio content.
 */
@JsPlainObject
external interface AudioContent :
    ContentBlock {
    /**
     * Discriminator for audio content.
     */
    override var type: String /* 'audio' */

    /**
     * Base64 payload.
     */
    var data: String

    /**
     * MIME type for the encoded audio.
     */
    var mimeType: String
}
