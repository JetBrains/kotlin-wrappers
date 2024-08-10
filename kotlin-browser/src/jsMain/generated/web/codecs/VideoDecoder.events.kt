// Automatically generated - do not modify!

package web.codecs

import web.events.Event
import web.events.EventInstance

inline val <C : VideoDecoder> C.dequeueEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.dequeue())
