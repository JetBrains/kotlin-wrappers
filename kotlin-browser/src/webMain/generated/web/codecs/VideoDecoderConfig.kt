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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#codedheight)
     */
    var codedHeight: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#codedwidth)
     */
    var codedWidth: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#colorspace)
     */
    var colorSpace: VideoColorSpaceInit?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#description)
     */
    var description: AllowSharedBufferSource?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#displayaspectheight)
     */
    var displayAspectHeight: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#displayaspectwidth)
     */
    var displayAspectWidth: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#hardwareacceleration)
     */
    var hardwareAcceleration: HardwareAcceleration?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure#optimizeforlatency)
     */
    var optimizeForLatency: Boolean?
}
