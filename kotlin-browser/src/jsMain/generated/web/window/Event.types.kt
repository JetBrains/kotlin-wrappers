// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.window

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.domContentLoaded(): EventType<Event, C> =
    EventType("DOMContentLoaded")

inline fun <C : EventTarget> Event.Companion.afterPrint(): EventType<Event, C> =
    EventType("afterprint")

inline fun <C : EventTarget> Event.Companion.beforePrint(): EventType<Event, C> =
    EventType("beforeprint")

inline fun <C : EventTarget> Event.Companion.languageChange(): EventType<Event, C> =
    EventType("languagechange")

inline fun <C : EventTarget> Event.Companion.offline(): EventType<Event, C> =
    EventType("offline")

inline fun <C : EventTarget> Event.Companion.online(): EventType<Event, C> =
    EventType("online")

inline fun <C : EventTarget> Event.Companion.resize(): EventType<Event, C> =
    EventType("resize")

inline fun <C : EventTarget> Event.Companion.scroll(): EventType<Event, C> =
    EventType("scroll")

inline fun <C : EventTarget> Event.Companion.unload(): EventType<Event, C> =
    EventType("unload")
