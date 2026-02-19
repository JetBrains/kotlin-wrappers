package web.mcp

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import js.promise.Promise
import js.promise.await
import kotlinx.js.JsPlainObject
import web.events.Event
import web.events.EventInstance
import web.events.EventTarget
import web.experimental.ExperimentalWebApi
import web.mcp.ModelContext.CallToolOptions
import kotlin.js.JsName
import kotlin.js.JsString

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
     * Registers a dynamic tool with JSON Schema-driven inference.
     *
     * `execute(args)` is inferred from `inputSchema`, and when a literal object
     * `outputSchema` is provided, `execute(...).structuredContent` is inferred too.
     */
    // registerTool<TInputSchema extends JsonSchemaForInference, TOutputSchema extends JsonSchemaObject | undefined = undefined, TName extends string = string>(tool: ToolDescriptorFromSchema<TInputSchema, TOutputSchema, TName>): RegistrationHandle;

    /**
     * Registers a dynamic tool with explicitly typed args/result.
     */
    // registerTool<TInputSchema extends InputSchema, TArgs extends Record<string, unknown> = Record<string, unknown>, TResult extends CallToolResult = CallToolResult, TName extends string = string>(tool: ToolDescriptor<TArgs, TResult, TName> & {
    //    inputSchema: TInputSchema;
    // } & (string extends TInputSchema['type'] ? unknown : never)): RegistrationHandle;

    /**
     * Unregisters a dynamic tool by name.
     */
    fun unregisterTool(name: ToolName)

    /**
     * Lists currently registered tools.
     */
    fun listTools(): ReadonlyArray<ToolListItem>

    /**
     * Executes a registered tool.
     */
    @JsName("callTool")
    fun callToolAsync(options: CallToolOptions): Promise<ToolResponse>

    @JsPlainObject
    interface CallToolOptions {
        var name: ToolName
        var arguments: ReadonlyRecord<JsString, *>?
    }

    /**
     * Clears all context (base + dynamic registrations).
     */
    fun clearContext()
}

@ExperimentalWebApi
suspend fun ModelContext.callTool(
    options: CallToolOptions,
): ToolResponse =
    callToolAsync(options).await()

@ExperimentalWebApi
inline val <C : ModelContext> C.toolCallEvent: EventInstance<ToolCallEvent, C, C>
    get() = EventInstance(this, "toolcall")

@ExperimentalWebApi
inline val <C : ModelContext> C.toolsChangedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "toolschanged")
