// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.window

import web.events.Event
import web.events.EventType

inline fun Event.Companion.domContentLoaded(): EventType<Event> =
    EventType("DOMContentLoaded")

inline fun Event.Companion.afterPrint(): EventType<Event> =
    EventType("afterprint")

inline fun Event.Companion.beforePrint(): EventType<Event> =
    EventType("beforeprint")

inline fun Event.Companion.languageChange(): EventType<Event> =
    EventType("languagechange")

inline fun Event.Companion.offline(): EventType<Event> =
    EventType("offline")

inline fun Event.Companion.online(): EventType<Event> =
    EventType("online")

inline fun Event.Companion.resize(): EventType<Event> =
    EventType("resize")

inline fun Event.Companion.scroll(): EventType<Event> =
    EventType("scroll")

inline fun Event.Companion.unload(): EventType<Event> =
    EventType("unload")
