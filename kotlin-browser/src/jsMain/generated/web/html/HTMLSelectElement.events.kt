// Automatically generated - do not modify!

package web.html

import web.dom.Node
import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/change_event)
 */
inline val <C : HTMLSelectElement> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.change())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/invalid_event)
 */
inline val <C : HTMLSelectElement> C.invalidEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.invalid())
