// Automatically generated - do not modify!

package web.html

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : HTMLDialogElement> C.cancelEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("cancel"))

inline val <C : HTMLDialogElement> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("close"))
