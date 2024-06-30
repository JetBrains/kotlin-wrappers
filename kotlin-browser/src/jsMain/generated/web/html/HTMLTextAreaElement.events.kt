// Automatically generated - do not modify!

package web.html

import web.dom.Node
import web.dom.invalid
import web.dom.select
import web.events.Event
import web.events.EventInstance

inline val <C : HTMLTextAreaElement> C.invalidEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.invalid())

inline val <C : HTMLTextAreaElement> C.selectEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.select())
