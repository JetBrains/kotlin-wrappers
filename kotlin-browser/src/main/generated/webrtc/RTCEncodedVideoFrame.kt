// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ArrayBuffer

sealed external class RTCEncodedVideoFrame {
    var data: ArrayBuffer
    val timestamp: Number
    val type: RTCEncodedVideoFrameType
    fun getMetadata(): RTCEncodedVideoFrameMetadata
}
