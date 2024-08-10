// Automatically generated - do not modify!

package web.html

import web.events.Event
import web.events.EventInstance

inline val <C : HTMLDialogElement> C.cancelEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.cancel())

inline val <C : HTMLDialogElement> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.close())
