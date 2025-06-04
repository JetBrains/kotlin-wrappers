// Automatically generated - do not modify!

package web.rtc

import js.buffer.ArrayBuffer
import js.core.Int53
import js.serialization.Serializable

/**
 * The **`RTCEncodedVideoFrame`** of the WebRTC API represents an encoded video frame in the WebRTC receiver or sender pipeline, which may be modified using a WebRTC Encoded Transform.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame)
 */
external class RTCEncodedVideoFrame
private constructor() :
    Serializable {
    /**
     * The **`data`** property of the RTCEncodedVideoFrame interface returns a buffer containing the frame data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/data)
     */
    var data: ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/timestamp)
     */
    val timestamp: Int53

    /**
     * The **`type`** read-only property of the RTCEncodedVideoFrame interface indicates whether this frame is a key frame, delta frame, or empty frame.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/type)
     */
    val type: RTCEncodedVideoFrameType

    /**
     * The **`getMetadata()`** method of the RTCEncodedVideoFrame interface returns an object containing the metadata associated with the frame.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata)
     */
    fun getMetadata(): RTCEncodedVideoFrameMetadata
}
