// Automatically generated - do not modify!

package web.canvas

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextlost_event)
 */
inline val <C : OffscreenCanvas> C.contextLostEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.CONTEXT_LOST)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextrestored_event)
 */
inline val <C : OffscreenCanvas> C.contextRestoredEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.CONTEXT_RESTORED)
