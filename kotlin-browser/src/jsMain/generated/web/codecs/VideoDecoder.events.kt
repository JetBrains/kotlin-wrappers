// Automatically generated - do not modify!

package web.codecs

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : VideoDecoder> C.dequeueEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("dequeue"))
