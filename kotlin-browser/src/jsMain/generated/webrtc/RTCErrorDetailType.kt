// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
