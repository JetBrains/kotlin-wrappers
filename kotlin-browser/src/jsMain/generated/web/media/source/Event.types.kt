// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.media.source

import web.events.Event
import web.events.EventType

inline fun Event.Companion.addSourceBuffer(): EventType<Event> =
    EventType("addsourcebuffer")

inline fun Event.Companion.removeSourceBuffer(): EventType<Event> =
    EventType("removesourcebuffer")

inline fun Event.Companion.sourceClose(): EventType<Event> =
    EventType("sourceclose")

inline fun Event.Companion.sourceEnded(): EventType<Event> =
    EventType("sourceended")

inline fun Event.Companion.sourceOpen(): EventType<Event> =
    EventType("sourceopen")

inline fun Event.Companion.update(): EventType<Event> =
    EventType("update")

inline fun Event.Companion.updateEnd(): EventType<Event> =
    EventType("updateend")

inline fun Event.Companion.updateStart(): EventType<Event> =
    EventType("updatestart")
