// Automatically generated - do not modify!

package webrtc

sealed external interface RTCSessionDescription {
    val sdp: String
    val type: RTCSdpType
    fun toJSON(): Any
}
