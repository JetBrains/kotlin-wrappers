// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.media.recorder

import web.events.Event
import web.events.EventType

inline fun Event.Companion.pause(): EventType<Event> =
    EventType("pause")

inline fun Event.Companion.resume(): EventType<Event> =
    EventType("resume")

inline fun Event.Companion.start(): EventType<Event> =
    EventType("start")

inline fun Event.Companion.stop(): EventType<Event> =
    EventType("stop")
