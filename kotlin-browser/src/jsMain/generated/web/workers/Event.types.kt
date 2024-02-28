// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.workers

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.languageChange(): EventType<Event<C>> =
    EventType("languagechange")

inline fun <C : EventTarget> Event.Companion.offline(): EventType<Event<C>> =
    EventType("offline")

inline fun <C : EventTarget> Event.Companion.online(): EventType<Event<C>> =
    EventType("online")
