// Automatically generated - do not modify!

package web.performance

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : Performance> C.resourceTimingBufferFullEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("resourcetimingbufferfull"))
