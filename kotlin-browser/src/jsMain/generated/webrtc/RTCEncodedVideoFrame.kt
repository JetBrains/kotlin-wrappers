// Automatically generated - do not modify!

package webrtc

import js.buffer.ArrayBuffer
import js.core.JsLong

sealed external class RTCEncodedVideoFrame {
    var data: ArrayBuffer
    val timestamp: JsLong
    val type: RTCEncodedVideoFrameType
    fun getMetadata(): RTCEncodedVideoFrameMetadata
}
