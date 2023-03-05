// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class RTCIceTransport :
    EventTarget {
    val gatheringState: RTCIceGathererState
    var ongatheringstatechange: EventHandler<Event>?
    var onselectedcandidatepairchange: EventHandler<Event>?
    var onstatechange: EventHandler<Event>?
    val state: RTCIceTransportState
    fun getSelectedCandidatePair(): RTCIceCandidatePair?
}
