// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.notifications

import web.events.Event
import web.events.EventType

inline fun Event.Companion.click(): EventType<Event> =
    EventType("click")

inline fun Event.Companion.show(): EventType<Event> =
    EventType("show")
