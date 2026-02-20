package web.mcp

import kotlinx.js.JsPlainObject

/**
 * Binary resource contents encoded as base64.
 */
@JsPlainObject
external interface BlobResourceContents :
    ResourceContents {
    /**
     * Canonical resource URI.
     */
    override var uri: String

    /**
     * Optional MIME type.
     */
    override var mimeType: String?

    /**
     * Base64-encoded binary payload.
     */
    var blob: String
}
