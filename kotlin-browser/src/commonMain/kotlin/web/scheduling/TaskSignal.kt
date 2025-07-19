package web.scheduling

import js.array.ReadonlyArray
import web.abort.AbortSignal
import web.events.EventHandler
import web.events.EventInstance
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskSignal)
 */
open external class TaskSignal
private constructor() :
    AbortSignal {

    val priority: TaskPriority

    var onprioritychange: EventHandler<TaskPriorityChangeEvent, TaskSignal, TaskSignal>

    companion object {
        fun any(
            signals: ReadonlyArray<AbortSignal>,
            init: TaskSignalAnyInit = definedExternally,
        ): TaskSignal
    }
}

inline val <C : TaskSignal> C.priorityChangeEvent: EventInstance<TaskPriorityChangeEvent, C, C>
    get() = EventInstance(this, "prioritychange")
