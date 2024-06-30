// Automatically generated - do not modify!

package web.media.source

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : SourceBufferList> C.addSourceBufferEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("addsourcebuffer"))

inline val <C : SourceBufferList> C.removeSourceBufferEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("removesourcebuffer"))
