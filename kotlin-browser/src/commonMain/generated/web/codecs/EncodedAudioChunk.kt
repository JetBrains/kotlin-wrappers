// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.core.Int53
import js.core.UInt53
import js.serializable.Serializable

/**
 * The **`EncodedAudioChunk`** interface of the WebCodecs API represents a chunk of encoded audio data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk)
 */
open external class EncodedAudioChunk(
    init: EncodedAudioChunkInit,
) : Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/byteLength)
     */
    val byteLength: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/duration)
     */
    val duration: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/timestamp)
     */
    val timestamp: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/type)
     */
    val type: EncodedAudioChunkType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/copyTo)
     */
    fun copyTo(destination: AllowSharedBufferSource)
}
