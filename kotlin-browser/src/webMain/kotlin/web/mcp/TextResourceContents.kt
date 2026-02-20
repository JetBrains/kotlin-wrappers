package web.mcp

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * Text resource contents.
 */
@JsPlainObject
@ExperimentalWebApi
external interface TextResourceContents :
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
     * UTF-8 resource payload.
     */
    var text: String
}
