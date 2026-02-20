package web.mcp

import web.events.Event
import web.experimental.ExperimentalWebApi
import kotlin.js.JsAny

/**
 * Event dispatched when a tool is called.
 */
@ExperimentalWebApi
external class ToolCallEvent<TArgs : JsAny?>
private constructor() :
    Event {
    /**
     * Tool name being invoked.
     */
    val name: ToolName<TArgs>

    /**
     * Tool arguments supplied by the caller.
     */
    val arguments: TArgs

    /**
     * Intercepts execution with a custom tool response.
     */
    fun respondWith(response: ToolResponse)
}
