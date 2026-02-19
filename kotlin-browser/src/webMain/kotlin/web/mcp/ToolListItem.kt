package web.mcp

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * Tool information returned by listTools().
 * Provides metadata about a registered tool without exposing the execute function.
 */
@JsPlainObject
@ExperimentalWebApi
external interface ToolListItem {
    /**
     * Unique tool identifier.
     */
    var name: ToolName

    /**
     * Human-readable summary of what the tool does.
     */
    var description: String

    /**
     * JSON Schema describing accepted input arguments.
     */
    var inputSchema: InputSchema

    /**
     * Optional JSON Schema describing output payload shape.
     */
    var outputSchema: InputSchema?

    /**
     * Optional behavior hints for LLM planners.
     */
    var annotations: ToolAnnotations?
}
