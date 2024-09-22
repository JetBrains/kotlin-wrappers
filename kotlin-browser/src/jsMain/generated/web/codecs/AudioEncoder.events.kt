// Automatically generated - do not modify!

package web.codecs

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/dequeue_event)
 */
inline val <C : AudioEncoder> C.dequeueEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.DEQUEUE)
