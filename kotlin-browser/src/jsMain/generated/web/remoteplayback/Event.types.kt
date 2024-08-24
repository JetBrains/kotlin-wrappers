// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.remoteplayback

import web.events.Event
import web.events.EventType

inline fun Event.Companion.connect(): EventType<Event> =
    EventType("connect")

inline fun Event.Companion.connecting(): EventType<Event> =
    EventType("connecting")

inline fun Event.Companion.disconnect(): EventType<Event> =
    EventType("disconnect")
