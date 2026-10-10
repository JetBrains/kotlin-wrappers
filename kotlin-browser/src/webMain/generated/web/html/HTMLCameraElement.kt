// Automatically generated - do not modify!

package web.html

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCameraElement)
 */
open external class HTMLCameraElement
protected constructor() :
    HTMLElement {
    // ...
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCameraElement/track_event)
 */
inline val <C : HTMLCameraElement> C.trackEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "track")
