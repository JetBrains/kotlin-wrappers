// Automatically generated - do not modify!

package webrtc

import kotlinext.js.ReadonlyArray

sealed external interface RTCConfiguration {
    var iceServers: ReadonlyArray<RTCIceServer>?
    var iceTransportPolicy: RTCIceTransportPolicy? // default = 'all'
    var bundlePolicy: RTCBundlePolicy? // default = 'balanced'
    var rtcpMuxPolicy: RTCRtcpMuxPolicy? // default = 'require'
    var peerIdentity: String? // default = null
    var certificates: ReadonlyArray<RTCCertificate>?
    var iceCandidatePoolSize: Number? // default = 0
}
