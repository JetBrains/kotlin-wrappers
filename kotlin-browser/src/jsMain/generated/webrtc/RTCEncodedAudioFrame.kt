// Automatically generated - do not modify!

package webrtc

import js.buffer.ArrayBuffer
import js.core.JsLong

sealed external class RTCEncodedAudioFrame {
    var data: ArrayBuffer
    val timestamp: JsLong
    fun getMetadata(): RTCEncodedAudioFrameMetadata
}
