package web.mcp

import js.internal.InternalApi
import kotlinx.js.JsPlainObject

/**
 * Resource contents returned by resource reads.
 */
@JsPlainObject
@SubclassOptInRequired(InternalApi::class)
external interface ResourceContents {
    /**
     * Canonical resource URI.
     */
    var uri: String

    /**
     * Optional MIME type.
     */
    var mimeType: String?
}
