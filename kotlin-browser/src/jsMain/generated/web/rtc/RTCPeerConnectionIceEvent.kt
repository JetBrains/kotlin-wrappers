// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.rtc

import web.events.Event
import web.events.EventType

/**
 * Events that occurs in relation to ICE candidates with the target, usually an RTCPeerConnection. Only one event is of this type: icecandidate.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceEvent)
 */
open external class RTCPeerConnectionIceEvent(
    override val type: EventType<RTCPeerConnectionIceEvent>,
    init: RTCPeerConnectionIceEventInit = definedExternally,
) : Event,
    RTCPeerConnectionIceEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceEvent/candidate)
     */
    override val candidate: RTCIceCandidate?

    companion object : RTCPeerConnectionIceEventTypes
}
