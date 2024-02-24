// Automatically generated - do not modify!

package web.media.source

import web.events.Event
import web.events.EventType

inline val Event.Companion.ADD_SOURCE_BUFFER: EventType<Event<*>>
    get() = EventType("addsourcebuffer")

inline val Event.Companion.REMOVE_SOURCE_BUFFER: EventType<Event<*>>
    get() = EventType("removesourcebuffer")

inline val Event.Companion.SOURCE_CLOSE: EventType<Event<*>>
    get() = EventType("sourceclose")

inline val Event.Companion.SOURCE_ENDED: EventType<Event<*>>
    get() = EventType("sourceended")

inline val Event.Companion.SOURCE_OPEN: EventType<Event<*>>
    get() = EventType("sourceopen")

inline val Event.Companion.UPDATE: EventType<Event<*>>
    get() = EventType("update")

inline val Event.Companion.UPDATE_END: EventType<Event<*>>
    get() = EventType("updateend")

inline val Event.Companion.UPDATE_START: EventType<Event<*>>
    get() = EventType("updatestart")
