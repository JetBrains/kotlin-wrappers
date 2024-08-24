// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.workers

import web.events.Event
import web.events.EventType

inline fun Event.Companion.languageChange(): EventType<Event> =
    EventType("languagechange")

inline fun Event.Companion.offline(): EventType<Event> =
    EventType("offline")

inline fun Event.Companion.online(): EventType<Event> =
    EventType("online")
