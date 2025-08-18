package web.presentation

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationAvailability)
 */
open external class PresentationAvailability
private constructor() :
    EventTarget {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationAvailability/value)
     */
    val value: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationAvailability/change_event)
     */
    var onchange: EventHandler<Event, PresentationAvailability, PresentationAvailability>?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationAvailability/change_event)
 */
inline val <C : PresentationAvailability> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "change")
