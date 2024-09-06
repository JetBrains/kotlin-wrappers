// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventType

sealed external class RTCPeerConnectionIceEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("RTCPeerConnectionIceEvent.ICE_CANDIDATE"),
    )
    @JsValue("icecandidate")
    fun iceCandidate(): EventType<RTCPeerConnectionIceEvent>
}
