// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.html

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.waitingForKey(): EventType<Event, C> =
    EventType("waitingforkey")
