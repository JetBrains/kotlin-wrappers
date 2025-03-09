// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue

sealed external interface RTCErrorDetailType {
    companion object {
        @JsValue("data-channel-failure")
        val dataChannelFailure: RTCErrorDetailType

        @JsValue("dtls-failure")
        val dtlsFailure: RTCErrorDetailType

        @JsValue("fingerprint-failure")
        val fingerprintFailure: RTCErrorDetailType

        @JsValue("hardware-encoder-error")
        val hardwareEncoderError: RTCErrorDetailType

        @JsValue("hardware-encoder-not-available")
        val hardwareEncoderNotAvailable: RTCErrorDetailType

        @JsValue("sctp-failure")
        val sctpFailure: RTCErrorDetailType

        @JsValue("sdp-syntax-error")
        val sdpSyntaxError: RTCErrorDetailType
    }
}
