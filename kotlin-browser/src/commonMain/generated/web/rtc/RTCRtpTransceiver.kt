// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray

/**
 * The WebRTC interface **`RTCRtpTransceiver`** describes a permanent pairing of an RTCRtpSender and an RTCRtpReceiver, along with some shared state.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver)
 */
open external class RTCRtpTransceiver
private constructor() {
    /**
     * The read-only RTCRtpTransceiver property **`currentDirection`** is a string which indicates the current negotiated directionality of the transceiver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/currentDirection)
     */
    val currentDirection: RTCRtpTransceiverDirection?

    /**
     * The RTCRtpTransceiver property **`direction`** is a string that indicates the transceiver's _preferred_ directionality.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/direction)
     */
    var direction: RTCRtpTransceiverDirection

    /**
     * The read-only RTCRtpTransceiver interface's **`mid`** property specifies the negotiated media ID (`mid`) which the local and remote peers have agreed upon to uniquely identify the stream's pairing of sender and receiver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/mid)
     */
    val mid: String?

    /**
     * The read-only **`receiver`** property of WebRTC's RTCRtpTransceiver interface indicates the RTCRtpReceiver responsible for receiving and decoding incoming media data for the transceiver's stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/receiver)
     */
    val receiver: RTCRtpReceiver

    /**
     * The read-only **`sender`** property of WebRTC's RTCRtpTransceiver interface indicates the RTCRtpSender responsible for encoding and sending outgoing media data for the transceiver's stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/sender)
     */
    val sender: RTCRtpSender

    /**
     * The **`setCodecPreferences()`** method of the RTCRtpTransceiver interface is used to set the codecs that the transceiver allows for decoding _received_ data, in order of decreasing preference.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/setCodecPreferences)
     */
    fun setCodecPreferences(codecs: ReadonlyArray<RTCRtpCodec>)

    /**
     * The **`stop()`** method in the RTCRtpTransceiver interface permanently stops the transceiver by stopping both the associated RTCRtpSender and RTCRtpReceiver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/stop)
     */
    fun stop()
}
