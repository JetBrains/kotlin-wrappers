// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.media.recorder

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.pause(): EventType<Event, C> =
    EventType("pause")

inline fun <C : EventTarget> Event.Companion.resume(): EventType<Event, C> =
    EventType("resume")

inline fun <C : EventTarget> Event.Companion.start(): EventType<Event, C> =
    EventType("start")

inline fun <C : EventTarget> Event.Companion.stop(): EventType<Event, C> =
    EventType("stop")
