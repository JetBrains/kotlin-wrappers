// Automatically generated - do not modify!

package web.serviceworker

import web.events.Event
import web.events.EventInstance

inline val <C : ServiceWorkerRegistration> C.updateFoundEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.updateFound())
