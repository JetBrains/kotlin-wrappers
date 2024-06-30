// Automatically generated - do not modify!

package web.media.source

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : MediaSource> C.sourceCloseEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("sourceclose"))

inline val <C : MediaSource> C.sourceEndedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("sourceended"))

inline val <C : MediaSource> C.sourceOpenEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("sourceopen"))
