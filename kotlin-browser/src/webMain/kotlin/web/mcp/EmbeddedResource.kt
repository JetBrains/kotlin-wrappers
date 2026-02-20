package web.mcp

import kotlinx.js.JsPlainObject

/**
 * Embedded resource content block.
 */
@JsPlainObject
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
