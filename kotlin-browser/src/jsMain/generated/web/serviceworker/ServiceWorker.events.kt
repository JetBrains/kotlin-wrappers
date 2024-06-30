// Automatically generated - do not modify!

package web.serviceworker

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : ServiceWorker> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("error"))

inline val <C : ServiceWorker> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("statechange"))
