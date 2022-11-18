// Automatically generated - do not modify!

package webrtc

import web.events.Event

external class RTCIceTransport : web.events.EventTarget {
    val gatheringState: RTCIceGathererState
    var ongatheringstatechange: ((event: Event) -> Unit)?
    var onstatechange: ((event: Event) -> Unit)?
    val state: RTCIceTransportState
}
