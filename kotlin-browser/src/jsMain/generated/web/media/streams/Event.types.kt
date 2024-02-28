// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.media.streams

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.ended(): EventType<Event<C>> =
    EventType("ended")

inline fun <C : EventTarget> Event.Companion.mute(): EventType<Event<C>> =
    EventType("mute")

inline fun <C : EventTarget> Event.Companion.unmute(): EventType<Event<C>> =
    EventType("unmute")
