// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
