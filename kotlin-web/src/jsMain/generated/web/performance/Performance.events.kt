// Automatically generated - do not modify!

package web.performance

import web.events.Event
import web.events.EventInstance

inline val <C : Performance> C.resourceTimingBufferFullEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.resourceTimingBufferFull())
