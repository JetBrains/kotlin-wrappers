// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.numbers.Int53
import js.numbers.UInt53
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/EncodedVideoChunk#init)
 */
@JsPlainObject
external interface EncodedVideoChunkInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/EncodedVideoChunk#data)
     */
    var data: AllowSharedBufferSource

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/EncodedVideoChunk#duration)
     */
    var duration: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/EncodedVideoChunk#timestamp)
     */
    var timestamp: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/EncodedVideoChunk#type)
     */
    var type: EncodedVideoChunkType
}
