package web.mcp

import js.core.Void
import js.promise.Promise
import web.abort.unsafeAbortable
import web.coroutines.await
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
    await { signal ->
        registerToolAsync(
            tool = tool,
            options = unsafeAbortable(signal),
        )
    }
}

@ExperimentalWebApi
suspend fun ModelContext.registerTool(
    tool: ModelContextTool,
    options: ModelContextRegisterToolOptions?,
) {
    await { signal ->
        registerToolAsync(
            tool = tool,
            options = unsafeAbortable(options, signal),
        )
    }
}

@ExperimentalWebApi
inline val <C : ModelContext> C.toolChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "toolchange")
