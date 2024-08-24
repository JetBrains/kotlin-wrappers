// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.media.streams

import web.events.Event
import web.events.EventType

inline fun Event.Companion.ended(): EventType<Event> =
    EventType("ended")

inline fun Event.Companion.mute(): EventType<Event> =
    EventType("mute")

inline fun Event.Companion.unmute(): EventType<Event> =
    EventType("unmute")
