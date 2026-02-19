package web.mcp

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi
import kotlin.js.JsAny

/**
 * The result returned from tool execution.
 *
 * [API Docs](https://spec.modelcontextprotocol.io/specification/server/tools/)
 */
@JsPlainObject
@ExperimentalWebApi
external interface CallToolResult {
    /**
     * Ordered content blocks to return to the model.
     */
    var content: ReadonlyArray<JsAny /* ContentBlock | LooseContentBlock */>

    /**
     * Optional machine-readable payload.
     */
    var structuredContent: JsAny? /* JsonObject? */

    /**
     * Marks the result as an error response.
     */
    var isError: Boolean?
}
