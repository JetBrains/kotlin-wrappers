// Automatically generated - do not modify!

package web.rtc

import web.events.*

/**
 * Provides access to information about the ICE transport layer over which the data is being sent and received.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport)
 */
sealed external class RTCIceTransport :
    EventTarget {
    /**
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state)
     */
    val state: RTCIceTransportState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/getSelectedCandidatePair)
     */
    fun getSelectedCandidatePair(): RTCIceCandidatePair?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringstatechange_event)
     */
    @JsEvent("gatheringstatechange")
    val gatheringStateChangeEvent: EventInstance<Event, RTCIceTransport /* this */, RTCIceTransport /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/icecandidate_event)
     */
    @JsEvent("icecandidate")
    val iceCandidateEvent: EventInstance<RTCPeerConnectionIceEvent, RTCIceTransport /* this */, RTCIceTransport /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/icecandidateerror_event)
     */
    @JsEvent("icecandidateerror")
    val iceCandidateErrorEvent: EventInstance<RTCPeerConnectionIceErrorEvent, RTCIceTransport /* this */, RTCIceTransport /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/selectedcandidatepairchange_event)
     */
    @JsEvent("selectedcandidatepairchange")
    val selectedCandidatePairChangeEvent: EventInstance<Event, RTCIceTransport /* this */, RTCIceTransport /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/statechange_event)
     */
    @JsEvent("statechange")
    val stateChangeEvent: EventInstance<Event, RTCIceTransport /* this */, RTCIceTransport /* this */>
}
