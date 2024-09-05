// Automatically generated - do not modify!

package web.serviceworker

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/error_event)
 */
inline val <C : ServiceWorker> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/statechange_event)
 */
inline val <C : ServiceWorker> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.stateChange())
