// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.audio

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.ended(): EventType<Event, C> =
    EventType("ended")

inline fun <C : EventTarget> Event.Companion.stateChange(): EventType<Event, C> =
    EventType("statechange")
