// Automatically generated - do not modify!

package webrtc

sealed external interface RTCEncodedAudioFrame {
    var data: kotlinx.js.ArrayBuffer
    val timestamp: Number
    fun getMetadata(): RTCEncodedAudioFrameMetadata
}
