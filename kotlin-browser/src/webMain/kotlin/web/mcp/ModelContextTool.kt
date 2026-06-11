package web.mcp

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * Tool descriptor for the Web Model Context API.
 *
 * Tools are functions that AI models can call to perform actions or retrieve
 * information. This interface uses JSON Schema for input validation.
 *
 * [API Docs][https://spec.modelcontextprotocol.io/specification/server/tools/]
 */
@JsPlainObject
@ExperimentalWebApi
external interface ModelContextTool {
    /**
     * Unique tool identifier.
     */
    var name: String

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

    /**
     * Tool execution function.
     */
    var execute: ToolExecuteCallback
}
