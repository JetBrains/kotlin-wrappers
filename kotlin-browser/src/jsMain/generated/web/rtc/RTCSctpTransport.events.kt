// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/statechange_event)
 */
inline val <C : RTCSctpTransport> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.stateChange())
