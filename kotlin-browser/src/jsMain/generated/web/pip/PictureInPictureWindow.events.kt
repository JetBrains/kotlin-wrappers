// Automatically generated - do not modify!

package web.pip

import web.events.Event
import web.events.EventInstance

inline val <C : PictureInPictureWindow> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.resize())
