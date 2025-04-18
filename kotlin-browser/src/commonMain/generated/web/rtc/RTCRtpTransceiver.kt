// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray

/**
 * The WebRTC interface **`RTCRtpTransceiver`** describes a permanent pairing of an RTCRtpSender and an RTCRtpReceiver, along with some shared state.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver)
 */
external class RTCRtpTransceiver
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/currentDirection)
     */
    val currentDirection: RTCRtpTransceiverDirection?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/direction)
     */
    var direction: RTCRtpTransceiverDirection

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/mid)
     */
    val mid: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/receiver)
     */
    val receiver: RTCRtpReceiver

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/sender)
     */
    val sender: RTCRtpSender

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/setCodecPreferences)
     */
    fun setCodecPreferences(codecs: ReadonlyArray<RTCRtpCodec>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/stop)
     */
    fun stop()
}
