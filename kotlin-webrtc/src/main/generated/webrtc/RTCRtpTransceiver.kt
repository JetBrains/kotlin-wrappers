// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCRtpTransceiver {
    val mid: String?
    val sender: RTCRtpSender
    val receiver: RTCRtpReceiver
    val stopped: Boolean
    var direction: RTCRtpTransceiverDirection
    fun setDirection(direction: RTCRtpTransceiverDirection)
    fun stop()
    fun setCodecPreferences(codecs: ReadonlyArray<RTCRtpCodecCapability>)
}
