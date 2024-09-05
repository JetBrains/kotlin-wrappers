// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionstatechange_event)
 */
inline val <C : RTCPeerConnection> C.connectionStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.connectionStateChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/datachannel_event)
 */
inline val <C : RTCPeerConnection> C.dataChannelEvent: EventInstance<RTCDataChannelEvent, C, C>
    get() = EventInstance(this, RTCDataChannelEvent.dataChannel())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidate_event)
 */
inline val <C : RTCPeerConnection> C.iceCandidateEvent: EventInstance<RTCPeerConnectionIceEvent, C, C>
    get() = EventInstance(this, RTCPeerConnectionIceEvent.iceCandidate())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidateerror_event)
 */
inline val <C : RTCPeerConnection> C.iceCandidateErrorEvent: EventInstance<RTCPeerConnectionIceErrorEvent, C, C>
    get() = EventInstance(this, RTCPeerConnectionIceErrorEvent.iceCandidateError())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceconnectionstatechange_event)
 */
inline val <C : RTCPeerConnection> C.iceConnectionStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.iceConnectionStateChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icegatheringstatechange_event)
 */
inline val <C : RTCPeerConnection> C.iceGatheringStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.iceGatheringStateChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/negotiationneeded_event)
 */
inline val <C : RTCPeerConnection> C.negotiationNeededEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.negotiationNeeded())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingstatechange_event)
 */
inline val <C : RTCPeerConnection> C.signalingStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.signalingStateChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/track_event)
 */
inline val <C : RTCPeerConnection> C.trackEvent: EventInstance<RTCTrackEvent, C, C>
    get() = EventInstance(this, RTCTrackEvent.track())
