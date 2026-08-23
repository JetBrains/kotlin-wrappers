// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/configure#config)
 */
@JsPlainObject
external interface AudioDecoderConfig {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/configure#codec)
     */
    var codec: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/configure#description)
     */
    var description: AllowSharedBufferSource?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/configure#numberOfChannels)
     */
    var numberOfChannels: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/configure#sampleRate)
     */
    var sampleRate: Int
}
