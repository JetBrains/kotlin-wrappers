// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

// language=JavaScript
@JsName("""(/*union*/{dataChannelFailure: 'data-channel-failure', dtlsFailure: 'dtls-failure', fingerprintFailure: 'fingerprint-failure', hardwareEncoderError: 'hardware-encoder-error', hardwareEncoderNotAvailable: 'hardware-encoder-not-available', sctpFailure: 'sctp-failure', sdpSyntaxError: 'sdp-syntax-error'}/*union*/)""")
sealed external interface RTCErrorDetailType {
    companion object {
        val dataChannelFailure: RTCErrorDetailType
        val dtlsFailure: RTCErrorDetailType
        val fingerprintFailure: RTCErrorDetailType
        val hardwareEncoderError: RTCErrorDetailType
        val hardwareEncoderNotAvailable: RTCErrorDetailType
        val sctpFailure: RTCErrorDetailType
        val sdpSyntaxError: RTCErrorDetailType
    }
}
