// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.audio

import web.events.Event
import web.events.EventType

inline fun Event.Companion.ended(): EventType<Event> =
    EventType("ended")

inline fun Event.Companion.stateChange(): EventType<Event> =
    EventType("statechange")
