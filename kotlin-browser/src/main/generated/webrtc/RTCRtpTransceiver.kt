// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCRtpTransceiver {
    val currentDirection: RTCRtpTransceiverDirection?
    var direction: RTCRtpTransceiverDirection
    val mid: String?
    val receiver: RTCRtpReceiver
    val sender: RTCRtpSender
    fun setCodecPreferences(codecs: ReadonlyArray<RTCRtpCodecCapability>)
    fun stop()
}
