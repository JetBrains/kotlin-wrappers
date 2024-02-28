// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.vtt

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.cueChange(): EventType<Event<C>> =
    EventType("cuechange")

inline fun <C : EventTarget> Event.Companion.enter(): EventType<Event<C>> =
    EventType("enter")

inline fun <C : EventTarget> Event.Companion.exit(): EventType<Event<C>> =
    EventType("exit")
