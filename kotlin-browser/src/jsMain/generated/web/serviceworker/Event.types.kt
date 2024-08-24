// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.serviceworker

import web.events.Event
import web.events.EventType

inline fun Event.Companion.controllerChange(): EventType<Event> =
    EventType("controllerchange")

inline fun Event.Companion.stateChange(): EventType<Event> =
    EventType("statechange")

inline fun Event.Companion.updateFound(): EventType<Event> =
    EventType("updatefound")
