package web.mcp

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * Binary resource contents encoded as base64.
 */
@JsPlainObject
@ExperimentalWebApi
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
