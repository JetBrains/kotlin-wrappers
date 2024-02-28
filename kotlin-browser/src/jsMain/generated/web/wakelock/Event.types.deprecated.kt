// Automatically generated - do not modify!

package web.wakelock

import web.events.Event
import web.events.EventType

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.release()"),
)
inline val Event.Companion.RELEASE: EventType<Event<*>>
    get() = EventType("release")
