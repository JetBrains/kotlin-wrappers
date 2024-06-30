// Automatically generated - do not modify!

package web.html

import web.dom.Node
import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : HTMLInputElement> C.cancelEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, EventType("cancel"))

inline val <C : HTMLInputElement> C.changeEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, EventType("change"))

inline val <C : HTMLInputElement> C.invalidEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("invalid"))

inline val <C : HTMLInputElement> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, EventType("select"))
