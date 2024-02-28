// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.notifications

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.click(): EventType<Event<C>> =
    EventType("click")

inline fun <C : EventTarget> Event.Companion.show(): EventType<Event<C>> =
    EventType("show")
