// Automatically generated - do not modify!

package web.performance

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/resourcetimingbufferfull_event)
 */
inline val <C : Performance> C.resourceTimingBufferFullEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.resourceTimingBufferFull())
