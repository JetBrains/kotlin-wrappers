// Automatically generated - do not modify!

package web.idb

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/error_event)
 */
inline val <C : IDBRequest<*>> C.errorEvent: EventInstance<Event, C, IDBTransaction>
    get() = EventInstance(this, Event.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/success_event)
 */
inline val <C : IDBRequest<*>> C.successEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.success())
