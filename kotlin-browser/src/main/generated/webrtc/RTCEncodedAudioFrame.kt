// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ArrayBuffer

sealed external class RTCEncodedAudioFrame {
    var data: ArrayBuffer
    val timestamp: Number
    fun getMetadata(): RTCEncodedAudioFrameMetadata
}
