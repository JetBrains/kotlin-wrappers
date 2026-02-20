package web.mcp

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * Embedded resource content block.
 */
@JsPlainObject
@ExperimentalWebApi
external interface EmbeddedResource :
    ContentBlock {
    /**
     * Discriminator for embedded resources.
     */
    override var type: String /* 'resource' */

    /**
     * Inlined resource contents.
     */
    var resource: ResourceContents
}
