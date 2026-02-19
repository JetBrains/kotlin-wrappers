package web.mcp

import js.objects.ReadonlyRecord
import web.events.Event
import web.experimental.ExperimentalWebApi
import kotlin.js.JsString

/**
 * Event dispatched when a tool is called.
 */
@ExperimentalWebApi
external class ToolCallEvent
private constructor() :
    Event {
    /**
     * Tool name being invoked.
     */
    val name: ToolName

    /**
     * Tool arguments supplied by the caller.
     */
    val arguments: ReadonlyRecord<JsString, *>

    /**
     * Intercepts execution with a custom tool response.
     */
    fun respondWith(response: ToolResponse)
}
