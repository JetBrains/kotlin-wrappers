// Automatically generated - do not modify!

package web.screen

import web.events.Event
import web.events.EventInstance

inline val <C : ScreenOrientation> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.change())
