// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.numbers.Int53
import js.numbers.JsUInt53
import js.numbers.UInt53
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata#return_value)
 */
@JsPlainObject
external interface RTCEncodedVideoFrameMetadata :
    RTCEncodedFrameMetadata {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata#dependencies)
     */
    var dependencies: ReadonlyArray<JsUInt53>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata#frameid)
     */
    var frameId: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata#height)
     */
    var height: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata#spatialindex)
     */
    var spatialIndex: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata#temporalindex)
     */
    var temporalIndex: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata#timestamp)
     */
    var timestamp: Int53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCEncodedVideoFrame/getMetadata#width)
     */
    var width: Short?
}
