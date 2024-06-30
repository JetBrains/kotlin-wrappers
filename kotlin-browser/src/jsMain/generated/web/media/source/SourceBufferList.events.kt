// Automatically generated - do not modify!

package web.media.source

import web.events.Event
import web.events.EventInstance

inline val <C : SourceBufferList> C.addSourceBufferEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.addSourceBuffer())

inline val <C : SourceBufferList> C.removeSourceBufferEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.removeSourceBuffer())
