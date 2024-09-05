// Automatically generated - do not modify!

package web.html

import web.dom.Node
import web.dom.invalid
import web.dom.select
import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/cancel_event)
 */
inline val <C : HTMLInputElement> C.cancelEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.cancel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/change_event)
 */
inline val <C : HTMLInputElement> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.change())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/invalid_event)
 */
inline val <C : HTMLInputElement> C.invalidEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.invalid())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/select_event)
 */
inline val <C : HTMLInputElement> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.select())
