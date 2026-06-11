package web.mcp

import js.core.Void
import js.promise.Promise
import web.abort.AbortController
import web.abort.internal.awaitCancellable
import web.abort.internal.createAbortable
import web.abort.internal.patchAbortOptions
import web.events.Event
import web.events.EventInstance
import web.events.EventTarget
import web.experimental.ExperimentalWebApi

/**
 * ModelContext interface on navigator.modelContext.
 */
@ExperimentalWebApi
open external class ModelContext
private constructor() :
    EventTarget {

    @JsName("registerTool")
    fun registerToolAsync(
        tool: ModelContextTool,
        options: ModelContextRegisterToolOptions? = definedExternally,
    ): Promise<Void>
}

@ExperimentalWebApi
suspend fun ModelContext.registerTool(
    tool: ModelContextTool,
) {
    val controller = AbortController()
    registerToolAsync(
        tool = tool,
        options = createAbortable(controller),
    ).awaitCancellable(controller)
}

@ExperimentalWebApi
suspend fun ModelContext.registerTool(
    tool: ModelContextTool,
    options: ModelContextRegisterToolOptions?,
) {
    val controller = AbortController()
    registerToolAsync(
        tool = tool,
        options = patchAbortOptions(options, controller),
    ).awaitCancellable(controller)
}

@ExperimentalWebApi
inline val <C : ModelContext> C.toolChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "toolchange")
