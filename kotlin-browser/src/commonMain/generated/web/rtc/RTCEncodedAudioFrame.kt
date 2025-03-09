// Automatically generated - do not modify!

package web.rtc

import js.buffer.ArrayBuffer
import js.core.JsLong

/**
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
    val timestamp: JsLong

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedAudioFrame/getMetadata)
     */
    fun getMetadata(): RTCEncodedAudioFrameMetadata
}
