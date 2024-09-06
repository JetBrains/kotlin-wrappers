// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventType

sealed external class RTCPeerConnectionIceErrorEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("RTCPeerConnectionIceErrorEvent.ICE_CANDIDATE_ERROR"),
    )
    @JsValue("icecandidateerror")
    fun iceCandidateError(): EventType<RTCPeerConnectionIceErrorEvent>
}
