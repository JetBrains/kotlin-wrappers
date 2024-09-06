// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionstatechange_event)
 */
inline val <C : RTCPeerConnection> C.connectionStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.CONNECTION_STATE_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/datachannel_event)
 */
inline val <C : RTCPeerConnection> C.dataChannelEvent: EventInstance<RTCDataChannelEvent, C, C>
    get() = EventInstance(this, RTCDataChannelEvent.DATA_CHANNEL)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidate_event)
 */
inline val <C : RTCPeerConnection> C.iceCandidateEvent: EventInstance<RTCPeerConnectionIceEvent, C, C>
    get() = EventInstance(this, RTCPeerConnectionIceEvent.ICE_CANDIDATE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidateerror_event)
 */
inline val <C : RTCPeerConnection> C.iceCandidateErrorEvent: EventInstance<RTCPeerConnectionIceErrorEvent, C, C>
    get() = EventInstance(this, RTCPeerConnectionIceErrorEvent.ICE_CANDIDATE_ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceconnectionstatechange_event)
 */
inline val <C : RTCPeerConnection> C.iceConnectionStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.ICE_CONNECTION_STATE_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icegatheringstatechange_event)
 */
inline val <C : RTCPeerConnection> C.iceGatheringStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.ICE_GATHERING_STATE_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/negotiationneeded_event)
 */
inline val <C : RTCPeerConnection> C.negotiationNeededEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.NEGOTIATION_NEEDED)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingstatechange_event)
 */
inline val <C : RTCPeerConnection> C.signalingStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.SIGNALING_STATE_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/track_event)
 */
inline val <C : RTCPeerConnection> C.trackEvent: EventInstance<RTCTrackEvent, C, C>
    get() = EventInstance(this, RTCTrackEvent.TRACK)
