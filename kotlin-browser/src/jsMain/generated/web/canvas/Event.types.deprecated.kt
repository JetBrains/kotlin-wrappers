// Automatically generated - do not modify!

package web.canvas

import web.events.Event
import web.events.EventType

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.contextLost()"),
)
inline val Event.Companion.CONTEXT_LOST: EventType<Event<*>>
    get() = EventType("contextlost")

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.contextRestored()"),
)
inline val Event.Companion.CONTEXT_RESTORED: EventType<Event<*>>
    get() = EventType("contextrestored")
