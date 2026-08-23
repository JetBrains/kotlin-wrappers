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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#bitrateMode)
     */
    var bitrateMode: VideoEncoderBitrateMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#codec)
     */
    var codec: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#contentHint)
     */
    var contentHint: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#displayHeight)
     */
    var displayHeight: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#displayWidth)
     */
    var displayWidth: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#framerate)
     */
    var framerate: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#hardwareAcceleration)
     */
    var hardwareAcceleration: HardwareAcceleration?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#height)
     */
    var height: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#latencyMode)
     */
    var latencyMode: LatencyMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#scalabilityMode)
     */
    var scalabilityMode: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure#width)
     */
    var width: Int
}
