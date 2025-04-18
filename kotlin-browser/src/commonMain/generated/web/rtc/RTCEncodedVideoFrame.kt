// Automatically generated - do not modify!

package web.rtc

import js.buffer.ArrayBuffer
import js.core.Int53

/**
 * The **`RTCEncodedVideoFrame`** of the WebRTC API represents an encoded video frame in the WebRTC receiver or sender pipeline, which may be modified using a WebRTC Encoded Transform.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame)
 */
external class RTCEncodedVideoFrame
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/data)
     */
    var data: ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/timestamp)
     */
    val timestamp: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/type)
     */
    val type: RTCEncodedVideoFrameType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata)
     */
    fun getMetadata(): RTCEncodedVideoFrameMetadata
}
