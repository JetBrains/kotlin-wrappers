package web.mcp

import js.internal.InternalApi
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * Any content block allowed in tool responses.
 */
@JsPlainObject
@ExperimentalWebApi
@SubclassOptInRequired(InternalApi::class)
external interface ContentBlock :
    ContentBlockBase {
    var type: String
}
