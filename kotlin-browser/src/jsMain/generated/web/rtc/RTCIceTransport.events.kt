// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : RTCIceTransport> C.gatheringStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("gatheringstatechange"))

inline val <C : RTCIceTransport> C.iceCandidateEvent: EventInstance<RTCPeerConnectionIceEvent, C, C>
    get() = EventInstance(this, EventType("icecandidate"))

inline val <C : RTCIceTransport> C.iceCandidateErrorEvent: EventInstance<RTCPeerConnectionIceErrorEvent, C, C>
    get() = EventInstance(this, EventType("icecandidateerror"))

inline val <C : RTCIceTransport> C.selectedCandidatePairChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("selectedcandidatepairchange"))

inline val <C : RTCIceTransport> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("statechange"))
