// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventType

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.ended()"),
)
inline val Event.Companion.ENDED: EventType<Event<*>>
    get() = EventType("ended")

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.stateChange()"),
)
inline val Event.Companion.STATE_CHANGE: EventType<Event<*>>
    get() = EventType("statechange")
