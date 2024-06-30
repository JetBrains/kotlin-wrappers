// Automatically generated - do not modify!

package web.idb

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : IDBDatabase> C.abortEvent: EventInstance<Event, C, IDBDatabase>
    get() = EventInstance(this, EventType("abort"))

inline val <C : IDBDatabase> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("close"))

inline val <C : IDBDatabase> C.errorEvent: EventInstance<Event, C, IDBTransaction>
    get() = EventInstance(this, EventType("error"))

inline val <C : IDBDatabase> C.versionChangeEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, EventType("versionchange"))
