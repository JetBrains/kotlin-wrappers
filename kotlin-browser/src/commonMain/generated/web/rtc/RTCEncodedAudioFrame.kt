// Automatically generated - do not modify!

package web.rtc

import js.buffer.ArrayBuffer
import js.core.Int53

/**
 * The **`RTCEncodedAudioFrame`** of the WebRTC API represents an encoded audio frame in the WebRTC receiver or sender pipeline, which may be modified using a WebRTC Encoded Transform.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame)
 */
external class RTCEncodedAudioFrame
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/data)
     */
    var data: ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/timestamp)
     */
    val timestamp: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/getMetadata)
     */
    fun getMetadata(): RTCEncodedAudioFrameMetadata
}
