// Automatically generated - do not modify!

package webrtc

sealed external interface RTCEncodedVideoFrame {
    var data: kotlinx.js.ArrayBuffer
    val timestamp: Number
    val type: RTCEncodedVideoFrameType
    fun getMetadata(): RTCEncodedVideoFrameMetadata
}
