// Automatically generated - do not modify!

package web.media.streams

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
    replaceWith = ReplaceWith("Event.mute()"),
)
inline val Event.Companion.MUTE: EventType<Event<*>>
    get() = EventType("mute")

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.unmute()"),
)
inline val Event.Companion.UNMUTE: EventType<Event<*>>
    get() = EventType("unmute")
