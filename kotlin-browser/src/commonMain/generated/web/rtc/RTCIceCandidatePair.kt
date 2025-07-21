// Automatically generated - do not modify!

package web.rtc

/**
 * The **`RTCIceCandidatePair`** dictionary describes a pair of ICE candidates which together comprise a description of a viable connection between two WebRTC endpoints.
 */
sealed external interface RTCIceCandidatePair {
    /**
     * The **`local`** property of the **RTCIceCandidatePair** dictionary specifies the RTCIceCandidate which describes the configuration of the local end of a viable WebRTC connection.
     */
    var local: RTCIceCandidate

    /**
     * The **`remote`** property of the **RTCIceCandidatePair** dictionary specifies the RTCIceCandidate describing the configuration of the remote end of a viable WebRTC connection.
     */
    var remote: RTCIceCandidate
}
