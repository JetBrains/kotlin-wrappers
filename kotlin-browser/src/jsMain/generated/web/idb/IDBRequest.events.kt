// Automatically generated - do not modify!

package web.idb

import web.events.Event
import web.events.EventInstance

inline val <C : IDBRequest<*>> C.errorEvent: EventInstance<Event, C, IDBTransaction>
    get() = EventInstance(this, Event.error())

inline val <C : IDBRequest<*>> C.successEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.success())
