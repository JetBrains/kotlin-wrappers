package web.mcp

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * Plain text content.
 */
@JsPlainObject
@ExperimentalWebApi
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
