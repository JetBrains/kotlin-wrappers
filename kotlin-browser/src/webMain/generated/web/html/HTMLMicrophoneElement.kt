// Automatically generated - do not modify!

package web.html

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMicrophoneElement)
 */
open external class HTMLMicrophoneElement
protected constructor() :
    HTMLElement {
    // ...
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMicrophoneElement/track_event)
 */
inline val <C : HTMLMicrophoneElement> C.trackEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "track")
