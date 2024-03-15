// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.media.devices

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.deviceChange(): EventType<Event, C> =
    EventType("devicechange")
