// Automatically generated - do not modify!

package web.codecs

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/dequeue_event)
 */
inline val <C : VideoEncoder> C.dequeueEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.dequeue())
