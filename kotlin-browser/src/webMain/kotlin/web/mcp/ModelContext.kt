package web.mcp

import js.array.ReadonlyArray
import js.promise.Promise
import js.promise.await
import kotlinx.js.JsPlainObject
import web.events.Event
import web.events.EventInstance
import web.events.EventTarget
import web.experimental.ExperimentalWebApi
import web.mcp.ModelContext.CallToolOptions
import kotlin.js.JsAny
import kotlin.js.JsName

/**
 * ModelContext interface on navigator.modelContext.
 */
@ExperimentalWebApi
open external class ModelContext
private constructor() :
    EventTarget {
    /**
     * Replaces base context with provided tools.
     */
    fun provideContext(context: ModelContextInput)

    /**
     * Registers a dynamic tool with explicitly typed args/result.
     */
    fun registerTool(tool: ToolDescriptor<*>): RegistrationHandle

    /**
     * Unregisters a dynamic tool by name.
     */
    fun unregisterTool(name: ToolName<*>)

    /**
     * Lists currently registered tools.
     */
    fun listTools(): ReadonlyArray<ToolListItem>

    /**
     * Executes a registered tool.
     */
    @JsName("callTool")
    fun callToolAsync(options: CallToolOptions<*>): Promise<ToolResponse>

    @JsPlainObject
    interface CallToolOptions<TArgs : JsAny?> {
        var name: ToolName<TArgs>
        var arguments: TArgs
    }

    /**
     * Clears all context (base + dynamic registrations).
     */
    fun clearContext()
}

@ExperimentalWebApi
suspend fun <TArgs : JsAny?> ModelContext.callTool(
    options: CallToolOptions<TArgs>,
): ToolResponse =
    callToolAsync(options).await()

@ExperimentalWebApi
inline val <C : ModelContext> C.toolCallEvent: EventInstance<ToolCallEvent<*>, C, C>
    get() = EventInstance(this, "toolcall")

@ExperimentalWebApi
inline val <C : ModelContext> C.toolsChangedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "toolschanged")
