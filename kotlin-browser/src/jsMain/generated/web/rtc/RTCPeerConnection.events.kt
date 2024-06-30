// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : RTCPeerConnection> C.connectionStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("connectionstatechange"))

inline val <C : RTCPeerConnection> C.dataChannelEvent: EventInstance<RTCDataChannelEvent, C, C>
    get() = EventInstance(this, EventType("datachannel"))

inline val <C : RTCPeerConnection> C.iceCandidateEvent: EventInstance<RTCPeerConnectionIceEvent, C, C>
    get() = EventInstance(this, EventType("icecandidate"))

inline val <C : RTCPeerConnection> C.iceCandidateErrorEvent: EventInstance<RTCPeerConnectionIceErrorEvent, C, C>
    get() = EventInstance(this, EventType("icecandidateerror"))

inline val <C : RTCPeerConnection> C.iceConnectionStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("iceconnectionstatechange"))

inline val <C : RTCPeerConnection> C.iceGatheringStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("icegatheringstatechange"))

inline val <C : RTCPeerConnection> C.negotiationNeededEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("negotiationneeded"))

inline val <C : RTCPeerConnection> C.signalingStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("signalingstatechange"))

inline val <C : RTCPeerConnection> C.trackEvent: EventInstance<RTCTrackEvent, C, C>
    get() = EventInstance(this, EventType("track"))
