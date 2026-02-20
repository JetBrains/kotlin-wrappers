package web.mcp

import js.internal.InternalApi
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * Resource contents returned by resource reads.
 */
@JsPlainObject
@ExperimentalWebApi
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
