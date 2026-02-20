package web.mcp

import kotlinx.js.JsPlainObject

/**
 * Link to an externally retrievable resource.
 */
@JsPlainObject
external interface ResourceLink :
    ContentBlock {
    /**
     * Discriminator for resource links.
     */
    override var type: String /* 'resource_link' */

    /**
     * Resource URI.
     */
    var uri: String

    /**
     * Optional display name.
     */
    var name: String?

    /**
     * Optional human-readable description.
     */
    var description: String?

    /**
     * Optional MIME type hint.
     */
    var mimeType: String?
}
