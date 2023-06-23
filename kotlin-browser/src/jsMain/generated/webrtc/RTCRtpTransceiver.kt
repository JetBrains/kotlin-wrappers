// Automatically generated - do not modify!

package webrtc

import js.core.ReadonlyArray

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver) */
sealed external class RTCRtpTransceiver {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/currentDirection) */
    val currentDirection: RTCRtpTransceiverDirection?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/direction) */
    var direction: RTCRtpTransceiverDirection

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/mid) */
    val mid: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/receiver) */
    val receiver: RTCRtpReceiver

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/sender) */
    val sender: RTCRtpSender

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/setCodecPreferences) */
    fun setCodecPreferences(codecs: ReadonlyArray<RTCRtpCodecCapability>)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/stop) */
    fun stop()
}
