// Automatically generated - do not modify!

package web.idb

import web.events.Event
import web.events.EventInstance

inline val <C : IDBDatabase> C.abortEvent: EventInstance<Event, C, IDBDatabase>
    get() = EventInstance(this, Event.abort())

inline val <C : IDBDatabase> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.close())

inline val <C : IDBDatabase> C.errorEvent: EventInstance<Event, C, IDBTransaction>
    get() = EventInstance(this, Event.error())

inline val <C : IDBDatabase> C.versionChangeEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, IDBVersionChangeEvent.versionChange())
