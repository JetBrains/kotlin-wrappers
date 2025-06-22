// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`RTCIceTransport`** interface provides access to information about the ICE transport layer over which the data is being sent and received.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport)
 */
external class RTCIceTransport
private constructor() :
    EventTarget {
    /**
     * The **`gatheringState`** read-only property of the RTCIceTransport interface returns a string that indicates the current gathering state of the ICE agent for this transport: `'new'`, `'gathering'`, or `'complete'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringState)
     */
    val gatheringState: RTCIceGathererState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringstatechange_event)
     */
    var ongatheringstatechange: EventHandler<Event, RTCIceTransport, RTCIceTransport>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/selectedcandidatepairchange_event)
     */
    var onselectedcandidatepairchange: EventHandler<Event, RTCIceTransport, RTCIceTransport>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/statechange_event)
     */
    var onstatechange: EventHandler<Event, RTCIceTransport, RTCIceTransport>?

    /**
     * The **`state`** read-only property of the RTCIceTransport interface returns the current state of the ICE transport, so you can determine the state of ICE gathering in which the ICE agent currently is operating.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state)
     */
    val state: RTCIceTransportState

    /**
     * The **`getSelectedCandidatePair()`** method of the RTCIceTransport interface returns an RTCIceCandidatePair object containing the current best-choice pair of ICE candidates describing the configuration of the endpoints of the transport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/getSelectedCandidatePair)
     */
    fun getSelectedCandidatePair(): RTCIceCandidatePair?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringstatechange_event)
 */
inline val RTCIceTransport.gatheringStateChangeEvent: EventInstance<Event, RTCIceTransport, RTCIceTransport>
    get() = EventInstance(this, "gatheringstatechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/icecandidate_event)
 */
inline val RTCIceTransport.iceCandidateEvent: EventInstance<RTCPeerConnectionIceEvent, RTCIceTransport, RTCIceTransport>
    get() = EventInstance(this, "icecandidate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/icecandidateerror_event)
 */
inline val RTCIceTransport.iceCandidateErrorEvent: EventInstance<RTCPeerConnectionIceErrorEvent, RTCIceTransport, RTCIceTransport>
    get() = EventInstance(this, "icecandidateerror")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/selectedcandidatepairchange_event)
 */
inline val RTCIceTransport.selectedCandidatePairChangeEvent: EventInstance<Event, RTCIceTransport, RTCIceTransport>
    get() = EventInstance(this, "selectedcandidatepairchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/statechange_event)
 */
inline val RTCIceTransport.stateChangeEvent: EventInstance<Event, RTCIceTransport, RTCIceTransport>
    get() = EventInstance(this, "statechange")
