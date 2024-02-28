// Automatically generated - do not modify!

package web.xhr

import web.events.Event
import web.events.EventType

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.readyStateChange()"),
)
inline val Event.Companion.READY_STATE_CHANGE: EventType<Event<*>>
    get() = EventType("readystatechange")
