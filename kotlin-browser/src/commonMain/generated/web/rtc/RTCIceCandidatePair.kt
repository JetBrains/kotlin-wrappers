// Automatically generated - do not modify!

package web.rtc

/**
 * The **`RTCIceCandidatePair`** dictionary describes a pair of ICE candidates which together comprise a description of a viable connection between two WebRTC endpoints.
 */
sealed external interface RTCIceCandidatePair {
    var local: RTCIceCandidate
    var remote: RTCIceCandidate
}
