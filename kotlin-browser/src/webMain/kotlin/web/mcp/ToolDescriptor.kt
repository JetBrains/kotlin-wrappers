package web.mcp

import js.objects.ReadonlyRecord
import js.promise.PromiseLike
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi
import kotlin.js.JsString

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
external interface ToolDescriptor {
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

    /**
     * Tool execution function.
     */
    var execute: (
        args: ReadonlyRecord<JsString, *>,
        context: ToolExecutionContext,
    ) -> PromiseLike<CallToolResult>
}
