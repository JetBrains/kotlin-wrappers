// Automatically generated - do not modify!

package web.workers

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/error_event)
 */
inline val <C : SharedWorker> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())
