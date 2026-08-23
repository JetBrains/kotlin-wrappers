// Automatically generated - do not modify!

package web.codecs

import js.numbers.UInt53
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#config)
 */
@JsPlainObject
external interface VideoEncoderConfig {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#alpha)
     */
    var alpha: AlphaOption?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#avc)
     */
    var avc: AvcEncoderConfig?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#bitrate)
     */
    var bitrate: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#bitratemode)
     */
    var bitrateMode: VideoEncoderBitrateMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#codec)
     */
    var codec: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#contenthint)
     */
    var contentHint: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#displayheight)
     */
    var displayHeight: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#displaywidth)
     */
    var displayWidth: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#framerate)
     */
    var framerate: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#hardwareacceleration)
     */
    var hardwareAcceleration: HardwareAcceleration?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#height)
     */
    var height: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#latencymode)
     */
    var latencyMode: LatencyMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#scalabilitymode)
     */
    var scalabilityMode: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#width)
     */
    var width: Int
}
