// Automatically generated - do not modify!

package web.rtc

import js.buffer.ArrayBuffer
import js.core.Int53
import js.serialization.Serializable

/**
 * The **`RTCEncodedAudioFrame`** of the WebRTC API represents an encoded audio frame in the WebRTC receiver or sender pipeline, which may be modified using a WebRTC Encoded Transform.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame)
 */
open external class RTCEncodedAudioFrame
private constructor() :
    Serializable {
    /**
     * The **`data`** property of the RTCEncodedAudioFrame interface returns a buffer containing the data for an encoded frame.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/data)
     */
    var data: ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/timestamp)
     */
    val timestamp: Int53

    /**
     * The **`getMetadata()`** method of the RTCEncodedAudioFrame interface returns an object containing the metadata associated with the frame.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/getMetadata)
     */
    fun getMetadata(): RTCEncodedAudioFrameMetadata
}
