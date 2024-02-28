// Automatically generated - do not modify!

package web.codecs

import web.events.Event
import web.events.EventTarget
import web.events.EventType

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.dequeue()"),
)
inline val Event.Companion.DEQUEUE: EventType<Event<EventTarget>>
    get() = EventType("dequeue")
