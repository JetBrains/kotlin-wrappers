// Automatically generated - do not modify!

package web.idb

import web.events.Event
import web.events.EventInstance

inline val <C : IDBTransaction> C.abortEvent: EventInstance<Event, C, IDBDatabase>
    get() = EventInstance(this, Event.abort())

inline val <C : IDBTransaction> C.completeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.complete())

inline val <C : IDBTransaction> C.errorEvent: EventInstance<Event, C, IDBTransaction>
    get() = EventInstance(this, Event.error())
