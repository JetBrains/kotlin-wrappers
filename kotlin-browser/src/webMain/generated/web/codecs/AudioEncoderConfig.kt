// Automatically generated - do not modify!

package web.codecs

import js.numbers.UInt53
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/configure#config)
 */
@JsPlainObject
external interface AudioEncoderConfig {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/configure#aac)
     */
    var aac: AacEncoderConfig?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/configure#bitrate)
     */
    var bitrate: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/configure#bitrateMode)
     */
    var bitrateMode: BitrateMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/configure#codec)
     */
    var codec: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/configure#numberOfChannels)
     */
    var numberOfChannels: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/configure#opus)
     */
    var opus: OpusEncoderConfig?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/configure#sampleRate)
     */
    var sampleRate: Int
}
