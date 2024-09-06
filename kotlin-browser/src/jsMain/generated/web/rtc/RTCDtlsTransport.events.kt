// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/error_event)
 */
inline val <C : RTCDtlsTransport> C.errorEvent: EventInstance<RTCErrorEvent, C, C>
    get() = EventInstance(this, RTCErrorEvent.ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/statechange_event)
 */
inline val <C : RTCDtlsTransport> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.STATE_CHANGE)
