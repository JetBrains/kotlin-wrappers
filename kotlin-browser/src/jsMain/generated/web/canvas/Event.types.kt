// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.canvas

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.contextLost(): EventType<Event<C>> =
    EventType("contextlost")

inline fun <C : EventTarget> Event.Companion.contextRestored(): EventType<Event<C>> =
    EventType("contextrestored")
