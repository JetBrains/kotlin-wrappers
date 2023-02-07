// Automatically generated - do not modify!

package webrtc

import js.buffer.ArrayBuffer

sealed external class RTCEncodedVideoFrame {
    var data: ArrayBuffer
    val timestamp: Number
    val type: RTCEncodedVideoFrameType
    fun getMetadata(): RTCEncodedVideoFrameMetadata
}
