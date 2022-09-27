// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCRtpParameters {
    var codecs: ReadonlyArray<RTCRtpCodecParameters>
    var headerExtensions: ReadonlyArray<RTCRtpHeaderExtensionParameters>
    var rtcp: RTCRtcpParameters
}
