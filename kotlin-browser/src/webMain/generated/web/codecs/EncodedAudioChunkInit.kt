// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.AllowSharedBufferSource
import js.buffer.ArrayBuffer
import js.numbers.Int53
import js.numbers.UInt53
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/EncodedAudioChunk#init)
 */
@JsPlainObject
external interface EncodedAudioChunkInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/EncodedAudioChunk#data)
     */
    var data: AllowSharedBufferSource

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/EncodedAudioChunk#duration)
     */
    var duration: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/EncodedAudioChunk#timestamp)
     */
    var timestamp: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/EncodedAudioChunk#transfer)
     */
    var transfer: ReadonlyArray<ArrayBuffer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/EncodedAudioChunk#type)
     */
    var type: EncodedAudioChunkType
}
