// Automatically generated - do not modify!

package web.media.source

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : SourceBuffer> C.abortEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("abort"))

inline val <C : SourceBuffer> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("error"))

inline val <C : SourceBuffer> C.updateEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("update"))

inline val <C : SourceBuffer> C.updateEndEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("updateend"))

inline val <C : SourceBuffer> C.updateStartEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("updatestart"))
