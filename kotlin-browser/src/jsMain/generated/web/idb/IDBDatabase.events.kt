// Automatically generated - do not modify!

package web.idb

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/abort_event)
 */
inline val <C : IDBDatabase> C.abortEvent: EventInstance<Event, C, IDBDatabase>
    get() = EventInstance(this, Event.abort())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close_event)
 */
inline val <C : IDBDatabase> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.close())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/error_event)
 */
inline val <C : IDBDatabase> C.errorEvent: EventInstance<Event, C, IDBTransaction>
    get() = EventInstance(this, Event.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/versionchange_event)
 */
inline val <C : IDBDatabase> C.versionChangeEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, IDBVersionChangeEvent.versionChange())
