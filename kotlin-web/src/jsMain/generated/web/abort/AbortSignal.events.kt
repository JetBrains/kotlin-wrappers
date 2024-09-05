// Automatically generated - do not modify!

package web.abort

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_event)
 */
inline val <C : AbortSignal> C.abortEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.abort())
