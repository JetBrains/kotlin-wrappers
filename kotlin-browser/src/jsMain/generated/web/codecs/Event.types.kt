// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.codecs

import web.events.Event
import web.events.EventType

inline fun Event.Companion.dequeue(): EventType<Event> =
    EventType("dequeue")
