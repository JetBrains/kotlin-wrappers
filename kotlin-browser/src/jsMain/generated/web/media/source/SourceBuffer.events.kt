// Automatically generated - do not modify!

package web.media.source

import web.events.Event
import web.events.EventInstance

inline val <C : SourceBuffer> C.abortEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.abort())

inline val <C : SourceBuffer> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

inline val <C : SourceBuffer> C.updateEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.update())

inline val <C : SourceBuffer> C.updateEndEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.updateEnd())

inline val <C : SourceBuffer> C.updateStartEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.updateStart())
