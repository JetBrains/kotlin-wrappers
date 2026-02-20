package web.mcp

import js.internal.InternalApi
import kotlinx.js.JsPlainObject

/**
 * Any content block allowed in tool responses.
 */
@JsPlainObject
@SubclassOptInRequired(InternalApi::class)
external interface ContentBlock :
    ContentBlockBase {
    var type: String
}
