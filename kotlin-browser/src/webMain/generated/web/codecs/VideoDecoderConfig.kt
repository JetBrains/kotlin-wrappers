// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#config)
 */
@JsPlainObject
external interface VideoDecoderConfig {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#codec)
     */
    var codec: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#codedHeight)
     */
    var codedHeight: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#codedWidth)
     */
    var codedWidth: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#colorSpace)
     */
    var colorSpace: VideoColorSpaceInit?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#description)
     */
    var description: AllowSharedBufferSource?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#displayAspectHeight)
     */
    var displayAspectHeight: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#displayAspectWidth)
     */
    var displayAspectWidth: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#hardwareAcceleration)
     */
    var hardwareAcceleration: HardwareAcceleration?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#optimizeForLatency)
     */
    var optimizeForLatency: Boolean?
}
