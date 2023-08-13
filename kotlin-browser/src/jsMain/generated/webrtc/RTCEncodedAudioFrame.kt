// Automatically generated - do not modify!

package webrtc

import js.buffer.ArrayBuffer
import js.core.JsLong

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame) */
sealed external class RTCEncodedAudioFrame {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/data) */
    var data: ArrayBuffer

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/timestamp) */
    val timestamp: JsLong

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/getMetadata) */
    fun getMetadata(): RTCEncodedAudioFrameMetadata
}
