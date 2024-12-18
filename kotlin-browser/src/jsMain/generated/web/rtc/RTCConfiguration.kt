// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface RTCConfiguration {
    val bundlePolicy: RTCBundlePolicy?
    val certificates: ReadonlyArray<RTCCertificate>?
    val iceCandidatePoolSize: UByte?
    val iceServers: ReadonlyArray<RTCIceServer>?
    val iceTransportPolicy: RTCIceTransportPolicy?
    val rtcpMuxPolicy: RTCRtcpMuxPolicy?
}
