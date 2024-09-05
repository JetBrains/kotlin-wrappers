// Automatically generated - do not modify!

package web.html

import web.dom.contextLost
import web.dom.contextRestored
import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/contextlost_event)
 */
inline val <C : HTMLCanvasElement> C.contextLostEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.contextLost())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/contextrestored_event)
 */
inline val <C : HTMLCanvasElement> C.contextRestoredEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.contextRestored())
