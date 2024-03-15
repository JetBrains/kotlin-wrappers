// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.media.source

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.addSourceBuffer(): EventType<Event, C> =
    EventType("addsourcebuffer")

inline fun <C : EventTarget> Event.Companion.removeSourceBuffer(): EventType<Event, C> =
    EventType("removesourcebuffer")

inline fun <C : EventTarget> Event.Companion.sourceClose(): EventType<Event, C> =
    EventType("sourceclose")

inline fun <C : EventTarget> Event.Companion.sourceEnded(): EventType<Event, C> =
    EventType("sourceended")

inline fun <C : EventTarget> Event.Companion.sourceOpen(): EventType<Event, C> =
    EventType("sourceopen")

inline fun <C : EventTarget> Event.Companion.update(): EventType<Event, C> =
    EventType("update")

inline fun <C : EventTarget> Event.Companion.updateEnd(): EventType<Event, C> =
    EventType("updateend")

inline fun <C : EventTarget> Event.Companion.updateStart(): EventType<Event, C> =
    EventType("updatestart")
