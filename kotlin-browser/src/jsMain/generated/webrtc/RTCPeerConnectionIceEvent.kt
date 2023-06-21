// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package webrtc

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface RTCPeerConnectionIceEventInit : EventInit {
    var candidate: RTCIceCandidate?
    var url: String?
}

open external class RTCPeerConnectionIceEvent(
    override val type: EventType<RTCPeerConnectionIceEvent>,
    init: RTCPeerConnectionIceEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceEvent/candidate) */
    val candidate: RTCIceCandidate?

    companion object
}
