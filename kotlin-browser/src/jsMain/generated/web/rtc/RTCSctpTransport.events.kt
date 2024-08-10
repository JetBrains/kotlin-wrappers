// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance

inline val <C : RTCSctpTransport> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.stateChange())
