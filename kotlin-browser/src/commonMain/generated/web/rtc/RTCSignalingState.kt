// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCSignalingState {
    companion object {
        @JsValue("closed")
        val closed: RTCSignalingState

        @JsValue("have-local-offer")
        val haveLocalOffer: RTCSignalingState

        @JsValue("have-local-pranswer")
        val haveLocalPranswer: RTCSignalingState

        @JsValue("have-remote-offer")
        val haveRemoteOffer: RTCSignalingState

        @JsValue("have-remote-pranswer")
        val haveRemotePranswer: RTCSignalingState

        @JsValue("stable")
        val stable: RTCSignalingState
    }
}
