// Automatically generated - do not modify!

package web.serviceworker

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updatefound_event)
 */
inline val <C : ServiceWorkerRegistration> C.updateFoundEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.UPDATE_FOUND)
