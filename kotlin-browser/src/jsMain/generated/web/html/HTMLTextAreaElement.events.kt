// Automatically generated - do not modify!

package web.html

import web.dom.Node
import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/invalid_event)
 */
inline val <C : HTMLTextAreaElement> C.invalidEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.INVALID)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/select_event)
 */
inline val <C : HTMLTextAreaElement> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.SELECT)
