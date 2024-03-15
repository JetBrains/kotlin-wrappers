// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.remoteplayback

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.connect(): EventType<Event, C> =
    EventType("connect")

inline fun <C : EventTarget> Event.Companion.connecting(): EventType<Event, C> =
    EventType("connecting")

inline fun <C : EventTarget> Event.Companion.disconnect(): EventType<Event, C> =
    EventType("disconnect")
