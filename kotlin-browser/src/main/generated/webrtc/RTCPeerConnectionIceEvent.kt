// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface RTCPeerConnectionIceEventInit : EventInit {
    var candidate: RTCIceCandidate?
    var url: String?
}

open external class RTCPeerConnectionIceEvent(
    type: EventType<RTCPeerConnectionIceEvent>,
    init: RTCPeerConnectionIceEventInit = definedExternally,
) : Event {
    val candidate: RTCIceCandidate?

    companion object
}
