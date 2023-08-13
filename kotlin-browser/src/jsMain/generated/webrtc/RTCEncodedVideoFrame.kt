// Automatically generated - do not modify!

package webrtc

import js.buffer.ArrayBuffer
import js.core.JsLong

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame) */
sealed external class RTCEncodedVideoFrame {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/data) */
    var data: ArrayBuffer

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/timestamp) */
    val timestamp: JsLong

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/type) */
    val type: RTCEncodedVideoFrameType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata) */
    fun getMetadata(): RTCEncodedVideoFrameMetadata
}
