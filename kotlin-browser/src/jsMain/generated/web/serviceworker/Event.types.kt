// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.serviceworker

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.controllerChange(): EventType<Event, C> =
    EventType("controllerchange")

inline fun <C : EventTarget> Event.Companion.stateChange(): EventType<Event, C> =
    EventType("statechange")

inline fun <C : EventTarget> Event.Companion.updateFound(): EventType<Event, C> =
    EventType("updatefound")
