// Automatically generated - do not modify!

package webrtc

sealed external interface RTCRtpCodecParameters {
    //payloadType: number;
    var mimeType: String

    //clockRate: number;
    var channels: Number? // default = 1
    var sdpFmtpLine: String?
}
