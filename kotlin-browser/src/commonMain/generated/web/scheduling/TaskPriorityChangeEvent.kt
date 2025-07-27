// Automatically generated - do not modify!

package web.scheduling

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType

/**
 * The **`TaskPriorityChangeEvent`** is the interface for the `prioritychange` event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskPriorityChangeEvent)
 */
open external class TaskPriorityChangeEvent(
    override val type: EventType<TaskPriorityChangeEvent>,
    init: TaskPriorityChangeEventInit,
) : Event {
    /**
     * The **`previousPriority`** read-only property of the TaskPriorityChangeEvent interface returns the priority of the corresponding TaskSignal before it was changed and this `prioritychange` event was emitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskPriorityChangeEvent/previousPriority)
     */
    val previousPriority: TaskPriority

    companion object
}

inline fun TaskPriorityChangeEvent.asInit(): TaskPriorityChangeEventInit =
    unsafeCast(this)

inline val TaskPriorityChangeEvent.Companion.PRIORITY_CHANGE: EventType<TaskPriorityChangeEvent>
    get() = EventType("prioritychange")
