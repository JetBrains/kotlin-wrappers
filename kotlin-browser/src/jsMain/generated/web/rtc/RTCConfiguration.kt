// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RTCConfiguration {
    val bundlePolicy: RTCBundlePolicy?
    val certificates: ReadonlyArray<RTCCertificate>?
    val iceCandidatePoolSize: Short /* unsigned byte */?
    val iceServers: ReadonlyArray<RTCIceServer>?
    val iceTransportPolicy: RTCIceTransportPolicy?
    val rtcpMuxPolicy: RTCRtcpMuxPolicy?
}
