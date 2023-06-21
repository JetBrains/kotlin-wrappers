// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class RTCIceTransport :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringState) */
    val gatheringState: RTCIceGathererState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringstatechange_event) */
    var ongatheringstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/selectedcandidatepairchange_event) */
    var onselectedcandidatepairchange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/statechange_event) */
    var onstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state) */
    val state: RTCIceTransportState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/getSelectedCandidatePair) */
    fun getSelectedCandidatePair(): RTCIceCandidatePair?
}
