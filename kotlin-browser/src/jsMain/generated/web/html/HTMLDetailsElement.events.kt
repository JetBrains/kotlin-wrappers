// Automatically generated - do not modify!

package web.html

import web.events.EventInstance
import web.uievents.ToggleEvent

inline val <C : HTMLDetailsElement> C.toggleEvent: EventInstance<ToggleEvent, C, C>
    get() = EventInstance(this, ToggleEvent.toggle())
