package web.scheduling

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TaskPriorityChangeEvent)
 */
open external class TaskPriorityChangeEvent(
    override val type: EventType<TaskPriorityChangeEvent>,
    init: TaskPriorityChangeEventInit,
) : Event {
    val previousPriority: TaskPriority

    companion object
}

inline fun TaskPriorityChangeEvent.asInit(): TaskPriorityChangeEventInit =
    unsafeCast(this)

inline val TaskPriorityChangeEvent.Companion.PRIORITY_CHANGE: EventType<TaskPriorityChangeEvent>
    get() = EventType("prioritychange")
