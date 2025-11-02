// Automatically generated - do not modify!

package web.scheduling

import js.array.ReadonlyArray
import web.abort.AbortSignal
import web.events.EventHandler
import web.events.EventInstance
import kotlin.js.definedExternally

/**
 * The **`TaskSignal`** interface of the Prioritized Task Scheduling API represents a signal object that allows you to communicate with a prioritized task, and abort it or change the priority (if required) via a TaskController object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskSignal)
 */
open external class TaskSignal
private constructor() :
    AbortSignal {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskSignal/prioritychange_event)
     */
    var onprioritychange: EventHandler<TaskPriorityChangeEvent, TaskSignal, TaskSignal>?

    /**
     * The read-only **`priority`** property of the TaskSignal interface indicates the signal priority.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskSignal/priority)
     */
    val priority: TaskPriority

    companion object {
        /**
         * The **`TaskSignal.any()`** static method takes an iterable of AbortSignal objects and returns a TaskSignal. The returned task signal is aborted when any of the abort signals is aborted.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskSignal/any_static)
         */
        fun any(
            signals: ReadonlyArray<AbortSignal>,
            init: TaskSignalAnyInit = definedExternally,
        ): TaskSignal
    }
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskSignal/prioritychange_event)
 */
inline val <C : TaskSignal> C.priorityChangeEvent: EventInstance<TaskPriorityChangeEvent, C, C>
    get() = EventInstance(this, "prioritychange")
