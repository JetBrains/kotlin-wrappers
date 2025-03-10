// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCRtpTransceiverDirection {
    companion object {
        @JsValue("inactive")
        val inactive: RTCRtpTransceiverDirection

        @JsValue("recvonly")
        val recvonly: RTCRtpTransceiverDirection

        @JsValue("sendonly")
        val sendonly: RTCRtpTransceiverDirection

        @JsValue("sendrecv")
        val sendrecv: RTCRtpTransceiverDirection

        @JsValue("stopped")
        val stopped: RTCRtpTransceiverDirection
    }
}
