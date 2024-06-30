// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance

inline val <C : RTCPeerConnection> C.connectionStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.connectionStateChange())

inline val <C : RTCPeerConnection> C.dataChannelEvent: EventInstance<RTCDataChannelEvent, C, C>
    get() = EventInstance(this, RTCDataChannelEvent.dataChannel())

inline val <C : RTCPeerConnection> C.iceCandidateEvent: EventInstance<RTCPeerConnectionIceEvent, C, C>
    get() = EventInstance(this, RTCPeerConnectionIceEvent.iceCandidate())

inline val <C : RTCPeerConnection> C.iceCandidateErrorEvent: EventInstance<RTCPeerConnectionIceErrorEvent, C, C>
    get() = EventInstance(this, RTCPeerConnectionIceErrorEvent.iceCandidateError())

inline val <C : RTCPeerConnection> C.iceConnectionStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.iceConnectionStateChange())

inline val <C : RTCPeerConnection> C.iceGatheringStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.iceGatheringStateChange())

inline val <C : RTCPeerConnection> C.negotiationNeededEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.negotiationNeeded())

inline val <C : RTCPeerConnection> C.signalingStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.signalingStateChange())

inline val <C : RTCPeerConnection> C.trackEvent: EventInstance<RTCTrackEvent, C, C>
    get() = EventInstance(this, RTCTrackEvent.track())
