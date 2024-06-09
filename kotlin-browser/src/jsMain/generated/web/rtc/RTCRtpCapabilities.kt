// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface RTCRtpCapabilities {
    var codecs: ReadonlyArray<RTCRtpCodecCapability>
    var headerExtensions: ReadonlyArray<RTCRtpHeaderExtensionCapability>
}
