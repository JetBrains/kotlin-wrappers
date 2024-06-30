// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance

inline val <C : RTCDtlsTransport> C.errorEvent: EventInstance<RTCErrorEvent, C, C>
    get() = EventInstance(this, RTCErrorEvent.error())

inline val <C : RTCDtlsTransport> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.stateChange())
