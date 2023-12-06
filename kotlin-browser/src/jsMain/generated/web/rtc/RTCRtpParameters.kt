// Automatically generated - do not modify!

package web.rtc

import js.core.ReadonlyArray

sealed external interface RTCRtpParameters {
    var codecs: ReadonlyArray<RTCRtpCodecParameters>
    var headerExtensions: ReadonlyArray<RTCRtpHeaderExtensionParameters>
    var rtcp: RTCRtcpParameters
}
