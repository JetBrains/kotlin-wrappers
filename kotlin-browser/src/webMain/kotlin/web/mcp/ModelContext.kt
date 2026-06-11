package web.mcp

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

    fun registerTool(
        tool: ModelContextTool,
    )
}

@ExperimentalWebApi
inline val <C : ModelContext> C.toolChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "toolchange")
