// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
sealed external interface RTCConfiguration {
    var bundlePolicy: RTCBundlePolicy?
    var certificates: ReadonlyArray<RTCCertificate>?
    var iceCandidatePoolSize: Short /* unsigned byte */?
    var iceServers: ReadonlyArray<RTCIceServer>?
    var iceTransportPolicy: RTCIceTransportPolicy?
    var rtcpMuxPolicy: RTCRtcpMuxPolicy?
}
