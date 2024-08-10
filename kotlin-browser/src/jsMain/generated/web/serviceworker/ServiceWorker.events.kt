// Automatically generated - do not modify!

package web.serviceworker

import web.events.Event
import web.events.EventInstance

inline val <C : ServiceWorker> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

inline val <C : ServiceWorker> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.stateChange())
