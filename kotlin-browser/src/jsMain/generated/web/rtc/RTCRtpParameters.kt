// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface RTCRtpParameters {
    var codecs: ReadonlyArray<RTCRtpCodecParameters>
    var headerExtensions: ReadonlyArray<RTCRtpHeaderExtensionParameters>
    var rtcp: RTCRtcpParameters
}
