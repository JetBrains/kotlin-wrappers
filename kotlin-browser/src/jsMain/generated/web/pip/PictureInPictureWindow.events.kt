// Automatically generated - do not modify!

package web.pip

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureWindow/resize_event)
 */
inline val <C : PictureInPictureWindow> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.resize())
