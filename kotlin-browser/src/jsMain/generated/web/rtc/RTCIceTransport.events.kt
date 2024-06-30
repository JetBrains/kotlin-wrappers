// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance

inline val <C : RTCIceTransport> C.gatheringStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.gatheringStateChange())

inline val <C : RTCIceTransport> C.iceCandidateEvent: EventInstance<RTCPeerConnectionIceEvent, C, C>
    get() = EventInstance(this, RTCPeerConnectionIceEvent.iceCandidate())

inline val <C : RTCIceTransport> C.iceCandidateErrorEvent: EventInstance<RTCPeerConnectionIceErrorEvent, C, C>
    get() = EventInstance(this, RTCPeerConnectionIceErrorEvent.iceCandidateError())

inline val <C : RTCIceTransport> C.selectedCandidatePairChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.selectedCandidatePairChange())

inline val <C : RTCIceTransport> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.stateChange())
