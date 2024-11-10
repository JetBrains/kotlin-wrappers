// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.core.JsLong

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk)
 */
open external class EncodedAudioChunk(
    init: EncodedAudioChunkInit,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/byteLength)
     */
    val byteLength: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/duration)
     */
    val duration: JsLong?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/timestamp)
     */
    val timestamp: JsLong

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/type)
     */
    val type: EncodedAudioChunkType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/copyTo)
     */
    fun copyTo(destination: AllowSharedBufferSource)
}
