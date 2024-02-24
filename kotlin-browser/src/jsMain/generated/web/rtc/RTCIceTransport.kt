// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

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
    var ongatheringstatechange: EventHandler<Event<RTCIceTransport>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/selectedcandidatepairchange_event)
     */
    var onselectedcandidatepairchange: EventHandler<Event<RTCIceTransport>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/statechange_event)
     */
    var onstatechange: EventHandler<Event<RTCIceTransport>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state)
     */
    val state: RTCIceTransportState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/getSelectedCandidatePair)
     */
    fun getSelectedCandidatePair(): RTCIceCandidatePair?
}
